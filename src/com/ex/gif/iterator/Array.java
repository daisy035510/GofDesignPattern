package com.ex.gif.iterator;

import java.util.List;

public class Array implements Aggregator {
    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public int getCount() {
        return items.length;
    }

    public Item getItem(int idx) {
        return items[idx];
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }
}
