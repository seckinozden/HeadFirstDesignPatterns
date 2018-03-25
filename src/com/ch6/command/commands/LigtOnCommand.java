package com.ch6.command.commands;

import com.ch6.command.Command;
import com.ch6.command.receivers.Light;

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
