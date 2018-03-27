package com.ch7.adapterandfacade.facade.components;

public class DvdPlayer {

    Amplifier amplifier;

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Dvd Player turned on.");
    }

    public void off() {
        System.out.println("Dvd Player turned off");
    }

    public void eject() {
        System.out.println("Movie ejected");
    }

    public void pause() {
        System.out.println("Movie paused");
    }

    public void play() {
        System.out.println("Movie played");
    }

    public void play(String movie) {
        System.out.println("Playing " + movie);
    }

    public void setSurroundAudio() {
        System.out.println("Surround Audio set.");
    }

    public void setTwoChannelAudio() {
        System.out.println("Two Channel Audio set");
    }

    public void stop() {
        System.out.println("Dvd Player stopped");
    }
}
