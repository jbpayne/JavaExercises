package com.tts.state;

public class Context {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();
        door.open();
        door.close();
        door.close();
        door.open();
        door.open();
    }
}
