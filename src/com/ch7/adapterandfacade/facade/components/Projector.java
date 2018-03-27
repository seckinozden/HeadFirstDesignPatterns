package com.ch7.adapterandfacade.facade.components;

public class Projector {

    DvdPlayer dvdPlayer;

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Projector turned on");
    }

    public void off() {
        System.out.println("Projector turned off");
    }

    public void tvMode() {
        System.out.println("Projector set to tv Mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector set to wide screen mode.");
    }
}
