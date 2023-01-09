package com.ex.factory;

public class MainEntry {
    public static void main(String[] args) {

        Factory factory = new ItemFactory();
        factory.create("sword");
        factory.create("sword");
        factory.create("sword");
        factory.create("sword");
        factory.create("sword");
    }
}
