package com.ex.gif.command;

import java.util.ArrayList;
import java.util.List;

public class CommandGroup implements Command {

    private List<Command> commandList = new ArrayList<>();

    public void add(Command command) {
        commandList.add(command);
    }
    @Override
    public void run() {

        int cnt = commandList.size();
        for(int i = 0; i < cnt; i++) {
            commandList.get(i).run();
        }
    }
}
