package com.ex.gif.iterator;

public class ArrayIterator implements Iterator {

    private Array array;
    private int index;

    ArrayIterator(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean next() {
        this.index++;
        return this.index < array.getCount();
    }

    @Override
    public Object current() {
        return array.getItem(this.index);
    }
}
