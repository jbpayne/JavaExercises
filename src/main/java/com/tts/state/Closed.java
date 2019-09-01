package com.tts.state;

public class Closed implements DoorState {

    @Override
    public DoorState open() {
        return null;
    }

    @Override
    public DoorState close() {
        return null;
    }
}
