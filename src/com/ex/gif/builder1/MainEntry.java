package com.ex.gif.builder1;

public class MainEntry {

    public static void main(String[] args) {

        Car car = new CarBuilder()
                .setAEB("a")
                .setAirbag("b")
                .setColor("c")
                .setColor("d")
                .setEngine("e")
                .setCameraSensor("f")
                .build();
    }
}
