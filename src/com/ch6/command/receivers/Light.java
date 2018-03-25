package com.ch6.command.receivers;

public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is turned on.");
    }

    public void off() {
        System.out.println(name + " light is turned off.");
    }
}
