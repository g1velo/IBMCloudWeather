package org.openhab.binding.IBMCloudWeather.objects;

import java.util.List;

public class Forecast48Hours {
    Metadata metadata;
    List<Forecast> forecasts;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }
}
