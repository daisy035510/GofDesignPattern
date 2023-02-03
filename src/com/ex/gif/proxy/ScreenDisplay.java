package com.ex.gif.proxy;

public class ScreenDisplay implements Display {
    @Override
    public void print(String contents) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(contents);
    }
}
