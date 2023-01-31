package com.ex.gif.iterator;

public class MainEntry {
    public static void main(String[] args) {

        Item[] items = {
                new Item("cpu", 1000),
                new Item("keyboard", 1000),
                new Item("mouse", 3000),
                new Item("gpu", 2000),
                new Item("monitor", 1500)
        };


        Array array = new Array(items);
        Iterator it = new ArrayIterator(array);

        while(it.next()) {
            Item item = (Item) it.current();
            System.out.println(item.toString());
        }
    }
}
