package com.ex.gif.adapter;

import java.util.ArrayList;

public class MainEntry {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Dog("강아지"));
        list.add(new Cat("고양이"));
        list.add(new Cat("솜털이"));
        list.add(new TigerAdapter("호랑이"));

        list.forEach(animal -> {
            animal.sound();
        });
    }
}
