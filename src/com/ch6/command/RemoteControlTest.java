package com.ch6.command;

import com.ch6.command.commands.GarageDoorOpenCommand;
import com.ch6.command.commands.LigtOnCommand;
import com.ch6.command.receivers.GarageDoor;
import com.ch6.command.receivers.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LigtOnCommand ligtOnCommand = new LigtOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(ligtOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
