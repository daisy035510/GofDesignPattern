package com.ex.gif.command;

public class CleaerCommand implements Command{
    @Override
    public void run() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
