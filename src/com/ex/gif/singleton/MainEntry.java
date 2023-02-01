package com.ex.gif.singleton;

public class MainEntry {
    public static void main(String[] args) {
        King king = King.getInstance();

        king.say();
    }
}
