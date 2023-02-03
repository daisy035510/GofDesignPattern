package com.ex.gif.decorator;

public abstract class Decorator extends Item{


    protected Item item;

    Decorator(Item item) {
        this.item = item;
    }

}
