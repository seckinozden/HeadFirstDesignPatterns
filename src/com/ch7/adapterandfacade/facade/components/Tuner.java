package com.ch7.adapterandfacade.facade.components;

public class Tuner {
    Amplifier amplifier;

    public void setAmplifier(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner turned on");
    }

    public void off() {
        System.out.println("Tuner turned off");
    }

    public void setAm() {
        System.out.println("Am is set");
    }

    public void setFm() {
        System.out.println("Fm is set");
    }

    public void setFrequency() {
        System.out.println("Frequency is set");
    }
}
