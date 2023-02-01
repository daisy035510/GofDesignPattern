package com.ex.gif.adapter;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " : 야옹");
    }
}
