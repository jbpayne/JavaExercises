package com.tts.state;

public class Door {

    private DoorState state = new Closed();

    public DoorState getState() {
        return state;
    }

    public void setState(DoorState state) {
        this.state = state;
    }
}
