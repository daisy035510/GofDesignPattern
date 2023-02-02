package com.ex.gif.factoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory {

    private class ItemData {

        private int currentCount;
        private int maxCount;

        public ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    private HashMap<String, ItemData> repository;

    ItemFactory() {
        repository = new HashMap<>();
        repository.put("bow", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("sword", new ItemData(3));
    }

    @Override
    public boolean isCreatable(String name) {

        ItemData item = repository.get(name);
        if(item.currentCount >= item.maxCount) {
            System.out.println(name + " 품절되었음");
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String name) {

        Item item = null;

        if("sword".equals(name)) return new Sword();
        else if("shield".equals(name)) return new Shield();
        else if("bow".equals(name)) return new Bow();

        return item;
    }

    @Override
    public void postProcessItem(String name) {

        ItemData item = repository.get(name);
        item.currentCount++;
    }
}
