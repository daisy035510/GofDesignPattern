package com.ex.gif.proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display {

    private ArrayList<String> buffer = new ArrayList<>();
    private ScreenDisplay screen;
    private int bufferSize;

    BufferDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String contents) {

        buffer.add(contents);
        if(bufferSize == buffer.size()) {
            flush();
        }
    }

    public void flush() {

        if(screen == null) screen = new ScreenDisplay();
        String lines = String.join("\n", buffer);
        screen.print(lines);
    }
}
