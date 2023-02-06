package com.ex.gif.command;

public class MainEntry {
    public static void main(String[] args) {
        CommandGroup group = new CommandGroup();
        group.add(new PrintCommand("안녕하세요"));
        group.add(new CleaerCommand());
        group.add(new ColorCommand(ColorCommand.Color.GREEN));
        group.add(new PrintCommand("ㅎ하하ㅏ하하하"));

        group.run();

    }
}
