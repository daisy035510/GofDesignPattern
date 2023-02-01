package com.ex.gif.adapter;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name +  " : 왈왈");
    }
}
