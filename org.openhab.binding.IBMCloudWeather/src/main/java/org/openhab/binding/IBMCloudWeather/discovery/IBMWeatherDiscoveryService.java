package org.openhab.binding.IBMCloudWeather.discovery;

import static org.openhab.binding.IBMCloudWeather.IBMCloudWeatherConstants.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.client.Client;

import org.eclipse.smarthome.config.discovery.AbstractDiscoveryService;
import org.eclipse.smarthome.config.discovery.DiscoveryResultBuilder;
import org.eclipse.smarthome.config.discovery.DiscoveryService;
import org.eclipse.smarthome.core.i18n.LocationProvider;
import org.eclipse.smarthome.core.library.types.PointType;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.ThingUID;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = DiscoveryService.class, immediate = true, configurationPid = "discovery.ibmcloudweather")
public class IBMWeatherDiscoveryService extends AbstractDiscoveryService {

    private Logger logger = LoggerFactory.getLogger(IBMWeatherDiscoveryService.class);
    private LocationProvider locationProvider;
    private PointType location;
    static private String user;
    static private String password;
    static private String url;
    private ClientConfig clientConfig;
    private Client client;
    private HttpAuthenticationFeature feature;

    private static final ThingUID METEO_THING = new ThingUID(THING_TYPE_METEO, "local");
    private static final ThingUID FORECAST_THING = new ThingUID(THING_TYPE_FORECAST, "local");

    public IBMWeatherDiscoveryService() {
        super(new HashSet<>(Arrays.asList(new ThingTypeUID(BINDING_ID, "-"))), 30, true);
        logger.debug("IBMCloudWeather constructor");
    }

    public IBMWeatherDiscoveryService(int timeout) throws IllegalArgumentException {
        super(timeout);
        logger.debug("Starting IBMCloudWeather discovery scan");
        PointType location = locationProvider.getLocation();
        if (location == null) {
            logger.debug("LocationProvider.getLocation() is not set -> Will not provide any discovery results");
            return;
        }
        createResults(location);
        // TODO Auto-generated constructor stub
    }

    public void createResults(PointType location) {
        this.location = location;
        String propGeolocation;
        propGeolocation = String.format("%s,%s,%s", location.getLatitude(), location.getLongitude(),
                location.getAltitude());
        thingDiscovered(DiscoveryResultBuilder.create(METEO_THING).withLabel("Current weather condition")
                .withProperty("geolocation", propGeolocation).withRepresentationProperty("geolocation").build());
        thingDiscovered(DiscoveryResultBuilder.create(FORECAST_THING).withLabel("Local Moon")
                .withProperty("geolocation", propGeolocation).withRepresentationProperty("geolocation").build());
    }

    @Override
    protected void startScan() {
        logger.debug("Starting scan ");

        String coordinate = String.format("%s,%s", location.getLatitude(), location.getLongitude());

    }

    @Override
    public synchronized void abortScan() {
        // TODO Auto-generated method stub
        super.abortScan();
        logger.debug("Aborting scan");
    }

    @Override
    protected synchronized void stopScan() {
        // TODO Auto-generated method stub
        super.stopScan();
        logger.debug("Stopping scan");
    }

    @Override
    public Set<ThingTypeUID> getSupportedThingTypes() {
        // TODO Auto-generated method stub
        return SUPPORTED_DEVICE_TYPES_UIDS;
    }

}