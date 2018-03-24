package com.ch6.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LigtOnCommand ligtOnCommand = new LigtOnCommand(light);

        simpleRemoteControl.setCommand(ligtOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
