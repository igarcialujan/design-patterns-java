package com.ismael.state.implementation;

public class DirectionService {
    private TravelMode currentTravelMode;

    public DirectionService(TravelMode currentTravelMode) {
        this.currentTravelMode = currentTravelMode;
    }

    public Object getEta() {
        return currentTravelMode.getEta();
    }

    public Object getDirection() {
        return currentTravelMode.getDirection();
    }

    public TravelMode getCurrentTravel() {
        return currentTravelMode;
    }

    public void setCurrentTravel(TravelMode currentTravelMode) {
        this.currentTravelMode = currentTravelMode;
    }
}
