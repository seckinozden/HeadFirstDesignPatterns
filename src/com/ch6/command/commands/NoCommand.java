package com.ch6.command.commands;

import com.ch6.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command!");
    }
}
