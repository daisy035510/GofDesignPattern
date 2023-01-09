package com.ex.singleton;

public class SpeackerMain {
    public static void main(String[] args) {

        Speacker speacker1 = Speacker.getInstance();
        Speacker speacker2 = Speacker.getInstance();

        speacker1.setVolume(11);
        System.out.println(speacker1.getVolume());
        System.out.println(speacker2.getVolume());

    }
}
