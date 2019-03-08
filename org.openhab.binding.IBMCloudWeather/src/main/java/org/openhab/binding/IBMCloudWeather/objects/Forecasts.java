package org.openhab.binding.IBMCloudWeather.objects;

public class Forecasts {
    Forecast[] forecasts;

    public Forecast[] getForecasts() {
        return forecasts;
    }

    public void setForecasts(Forecast[] forecasts) {
        this.forecasts = forecasts;
    }
}
