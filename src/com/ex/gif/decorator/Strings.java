package com.ex.gif.decorator;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings extends Item{

    private ArrayList<String> strings = new ArrayList<>();

    public void add(String str) {
        strings.add(str);
    }

    @Override
    public int getLinesCount() {
        return strings.size();
    }

    @Override
    public int getMaxLength() {
        Iterator<String> itr = strings.iterator();
        int maxWidth = 0;

        while(itr.hasNext()) {
            String string = itr.next();
            int width = string.length();

            if(maxWidth > width) maxWidth = width;
        }

        return maxWidth;
    }

    @Override
    public int getLength(int index) {
        return strings.get(index).length();
    }

    @Override
    public String getString(int index) {
        return strings.get(index);
    }
}
