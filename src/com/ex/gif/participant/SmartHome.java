package com.ex.gif.participant;

public class SmartHome implements Mediator {

    public Door door = new Door(this);
    public CoolAircon aircon = new CoolAircon(this);
    public Window window = new Window(this);
    public HeatBoiler boiler = new HeatBoiler(this);
    @Override
    public void participantChanged(Participant participant) {

        if(participant == door && !door.isbClosed()) {
            aircon.turnOff();
            boiler.turnOff();
        }

        if(participant == window && !window.isbClosed()) {
            aircon.turnOff();
            boiler.turnOff();
        }

        if(participant == aircon && aircon.isRunning()) {
            boiler.turnOff();
            window.close();
            door.close();
        }

        if(participant == boiler && boiler.isRunning()) {
            aircon.turnOff();
            window.close();
            door.close();
        }
    }

    public void report() {
        System.out.println(door);
        System.out.println(window);
        System.out.println(aircon);
        System.out.println(boiler);
        System.out.println();
    }
}
