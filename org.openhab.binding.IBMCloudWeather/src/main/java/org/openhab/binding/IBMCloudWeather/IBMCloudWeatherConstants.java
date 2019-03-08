package org.openhab.binding.IBMCloudWeather;

import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

import com.google.common.collect.ImmutableSet;

public class IBMCloudWeatherConstants {

    public static final String BINDING_ID = "ibmcloudweather";
    public final static ThingTypeUID THING_TYPE_METEO = new ThingTypeUID(BINDING_ID, "meteo");
    public final static ThingTypeUID THING_TYPE_FORECAST = new ThingTypeUID(BINDING_ID, "hourlyforecast");

    /** Supported devices (things + bridges) */
    public final static Set<ThingTypeUID> SUPPORTED_DEVICE_TYPES_UIDS = ImmutableSet.of(THING_TYPE_METEO,
            THING_TYPE_FORECAST);

    // List of all Channel ids
    public final static String TEMP = "temp";
    public final static String RH = "rh";
    public final static String WX_PHRASE = "wx_phrase";
    public final static String PRESSURE = "pressure";
    public final static String WDIR = "wdir";
    public final static String WDIR_CARDINAL = "wdir_cardinal";
    public final static String WSPD = "wspd";
    public final static String PRECIP_TOTAL = "precip_total";
    public final static String PRECIP_HRLY = "precip_hrly";
    public final static String UV_DESC = "uv_desc";
    public final static String UV_INDEX = "uv_index";

    public final static String TEMP1H = "temp1h";
    public final static String TEMP2H = "temp2h";
    public final static String TEMP3H = "temp3h";
    public final static String TEMP4H = "temp4h";
    public final static String TEMP6H = "temp6h";
    public final static String TEMP9H = "temp9h";
    public final static String TEMP12H = "temp12h";
    public final static String TEMP18H = "temp18h";
    public final static String TEMP24H = "temp24h";
    public final static String TEMP30H = "temp30h";
    public final static String TEMP36H = "temp36h";
    public final static String TEMP42H = "temp42h";
    public final static String TEMP48H = "temp48h";

    public static final String PARAMETER_USER = "user";
    public static final String PARAMETER_PASSWORD = "password";
    public static final String PARAMETER_URL = "url";

    public static final Set<String> SUPPORTED_METEO_CHANNELS = ImmutableSet.of(TEMP, RH, WX_PHRASE, PRESSURE, WDIR,
            WDIR_CARDINAL, WSPD, PRECIP_TOTAL, PRECIP_HRLY, UV_DESC);

    public static final Set<String> SUPPORTED_FORECAST_CHANNELS = ImmutableSet.of(TEMP1H, TEMP2H, TEMP3H, TEMP4H,
            TEMP6H, TEMP9H, TEMP12H, TEMP18H, TEMP24H, TEMP30H, TEMP36H, TEMP42H, TEMP48H);

}
