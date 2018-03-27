package com.ch7.adapterandfacade.facade.components;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void on() {
        System.out.println("Amplifier turned on");
    }

    public void off() {
        System.out.println("Amplifier turned off");
    }

    public void setCd() {
        System.out.println("CD is set");
    }

    public void setDvd() {
        System.out.println("Dvd is set");
    }

    public void setStereoSound() {
        System.out.println("Stereo sound is set");
    }

    public void setSurroundSound() {
        System.out.println("Surround sound is set");
    }

    public void setTuner() {
        System.out.println("Tuner is set");
    }

    public void setVolume() {
        System.out.println("Volume is set.");
    }
}
