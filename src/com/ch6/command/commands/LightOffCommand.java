package com.ch6.command.commands;

import com.ch6.command.Command;
import com.ch6.command.receivers.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
