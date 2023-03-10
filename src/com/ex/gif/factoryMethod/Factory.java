package com.ex.gif.factoryMethod;

public abstract class Factory {

    public Item create(String name) {
        boolean bCreatable = this.isCreatable(name);
        if(bCreatable == true) {
            Item item = this.createItem(name);
            postProcessItem(name);
            return item;
        }

        return null;
    }

    public abstract boolean isCreatable(String name);
    public abstract Item createItem(String name);
    public abstract void postProcessItem(String name);

}
