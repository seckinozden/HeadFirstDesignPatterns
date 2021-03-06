package com.ch6.command;

import com.ch6.command.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();

        buffer.append("\n-------- Remote Control --------\n");

        for (int i = 0; i < 7; i++) {
            buffer.append("[slot " + i + "]" +
                    onCommands[i].getClass().getName() + "   " +
                    offCommands[i].getClass().getName() + "\n");
        }
        return buffer.toString();
    }
}
