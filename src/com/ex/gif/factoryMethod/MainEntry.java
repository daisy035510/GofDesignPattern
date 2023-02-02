package com.ex.gif.factoryMethod;

public class MainEntry {
    public static void main(String[] args) {

         Factory factory = new ItemFactory();
         Item item1 = factory.create("sword");
         Item item2 = factory.create("sword");
         Item item3 = factory.create("sword");
         Item item4 = factory.create("sword");

         item1.use();
        item2.use();
        item3.use();

    }

}
