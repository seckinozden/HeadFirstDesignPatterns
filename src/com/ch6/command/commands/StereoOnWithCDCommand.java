package com.ch6.command.commands;

import com.ch6.command.Command;
import com.ch6.command.receivers.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("Selda Bagcan");
        stereo.setVolume(11);
    }
}
