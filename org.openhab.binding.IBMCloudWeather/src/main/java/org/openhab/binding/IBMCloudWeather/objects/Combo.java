package org.openhab.binding.IBMCloudWeather.objects;

public class Combo {
    Metadata metadata;
    Observation observation;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }
}
