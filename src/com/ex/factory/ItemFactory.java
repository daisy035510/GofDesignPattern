package com.ex.factory;

import java.util.HashMap;

public class ItemFactory extends Factory{

    private class ItemData {

        int maxCount;
        int currentCount;

        ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }

    private HashMap<String, ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<String, ItemData>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }

    @Override
    public boolean isCreatable(String name) {

        ItemData itemData = repository.get(name);

        if(itemData == null) {
            System.out.println("알 수 없는 데이터");
            return false;
        }

        if(itemData.maxCount >= itemData.currentCount) {
            System.out.println("더 이상 만들 수 없음");
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String name) {

        Item item = null;

        if("sword".equals(name)) item = new Sword();
        if("bow".equals(name)) item = new Bow();
        if("shield".equals(name)) item = new Bow();

        return item;
    }

    @Override
    public void postProcessItem(String name) {

        ItemData itemData = repository.get(name);
        if(itemData != null) {
            itemData.currentCount++;
        }
    }
}
