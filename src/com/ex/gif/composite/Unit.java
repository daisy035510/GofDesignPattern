package com.ex.gif.composite;

public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " size : " + getSize() + "MB ";
    }

    public abstract int getSize();

}
