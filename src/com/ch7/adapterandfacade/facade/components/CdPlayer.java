package com.ch7.adapterandfacade.facade.components;

public class CdPlayer {
    Amplifier amplifier;

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("CD Player turned on");
    }

    public void off() {
        System.out.println("CD player turned off");
    }

    public void eject() {
        System.out.println("CD ejected");
    }

    public void pause() {
        System.out.println("CD paused");
    }

    public void play() {
        System.out.println("Playing CD");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void stop() {
        System.out.println("CD player stopped");
    }
}
