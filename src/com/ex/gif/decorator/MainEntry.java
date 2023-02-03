package com.ex.gif.decorator;

public class MainEntry {
    public static void main(String[] args) {
        Strings strings = new Strings();
        strings.add("안녕하세요");
        strings.add("안녕하세요1");
        strings.add("안녕하세요2");
        strings.add("안녕하세요3");

        Item decorator = new SideDecorator(strings, '|');

        decorator.print();
    }
}
