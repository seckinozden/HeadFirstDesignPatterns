package com.ch6.command;

public class LigtOnCommand implements Command {

    Light light;

    public LigtOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
