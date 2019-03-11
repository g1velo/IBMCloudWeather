package org.openhab.binding.IBMCloudWeather.handler;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.smarthome.core.library.types.DecimalType;
import org.eclipse.smarthome.core.thing.Channel;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.openhab.binding.IBMCloudWeather.objects.Forecast48Hours;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HourlyForecastHandler extends BaseThingHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private ScheduledFuture<?> refreshJob;
    static private String user;
    static private String password;
    static private String url;
    private Integer refresh;
    private ClientConfig clientConfig;
    private Client client;
    private HttpAuthenticationFeature feature;
    private Thing thing;

    public HourlyForecastHandler(Thing thing) {
        super(thing);
        this.thing = thing;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        // TODO Auto-generated method stub

    }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        // super.initialize();
        logger.debug("Initializing meteo Handler");

        Map<String, Object> m = thing.getConfiguration().getProperties();
        HourlyForecastHandler.user = (String) m.get("user");
        HourlyForecastHandler.password = (String) m.get("password");
        HourlyForecastHandler.url = (String) m.get("url");
        this.refresh = (Integer) m.get("refresh");

        this.clientConfig = new ClientConfig();

        feature = HttpAuthenticationFeature.basic(HourlyForecastHandler.user, HourlyForecastHandler.password);

        clientConfig.register(feature);

        client = ClientBuilder.newClient(clientConfig);

        logger.debug("confg parameter user : {}", HourlyForecastHandler.user);
        logger.debug("confg parameter password: {}", HourlyForecastHandler.password);
        logger.debug("confg parameter url : {}", HourlyForecastHandler.url);

        startAutomaticRefresh();
        updateStatus(ThingStatus.ONLINE);

    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        logger.debug("Removing meteo Handler");
        refreshJob.cancel(true);
        updateStatus(ThingStatus.OFFLINE);
        super.dispose();
    }

    private void startAutomaticRefresh() {

        logger.debug("startAutomaticRefresh()");

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

                logger.debug("Starting target");
                WebTarget webTarget = client.target("https://" + url).queryParam("language", "fr-FR")
                        .queryParam("units", "m")
                        .path("/api/weather/v1/location/34000%3A4%3AFR/forecast/hourly/48hour.json");
                Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
                Response response = invocationBuilder.get();

                if (response.getStatus() == 200) {

                    // Jackson code to convert JSON String to Java object
                    ObjectMapper objectMapper = new ObjectMapper();
                    // objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                    String JSON = response.readEntity(String.class);
                    // JsonFactory jf = new JsonFactory();

                    try {

                        Forecast48Hours hf = objectMapper.readValue(JSON, Forecast48Hours.class);
                        logger.info("size : {} ", hf.getForecasts().size());
                        List<Channel> lc = getThing().getChannels();
                        logger.info("Channel number : {} ", lc.size());

                        for (int i = 0; i < hf.getForecasts().size(); i++) {
                            logger.info("temperature : {} at : {} ", hf.getForecasts().get(i).getTemp(),
                                    hf.getForecasts().get(i).getFcst_valid_local());
                            logger.info("Météo prévue : {} ", hf.getForecasts().get(i).getPhrase_32char());
                            logger.info("Hugrometire : {} : Clouds % {}  ", hf.getForecasts().get(i).getRh(),
                                    hf.getForecasts().get(i).getClds());
                            ChannelUID c = new ChannelUID(getThing().getUID() + ":temp" + (i + 1) + "h");
                            updateState(c, new DecimalType(hf.getForecasts().get(i).getTemp()));
                        }

                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                } else {
                    logger.info(String.valueOf(response.getStatus()));
                    logger.info(response.getStatusInfo().toString());
                    logger.error("there was an error");
                }

            }
        };
        refreshJob = scheduler.scheduleWithFixedDelay(runnable, 30, refresh, TimeUnit.SECONDS);
    }

}
