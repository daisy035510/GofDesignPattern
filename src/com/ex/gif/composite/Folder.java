package com.ex.gif.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Folder extends Unit{

    private List<Unit> unitList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(Unit unit) {
        unitList.add(unit);
    }
    @Override
    public int getSize() {

        int size = 0;
        Iterator<Unit> itr = unitList.iterator();

        while(itr.hasNext()) {
            Unit unit = itr.next();
            size += unit.getSize();
        }
        return size;
    }

    private void list(String indent, Unit unit ) {

        if(unit instanceof File) {
            System.out.println(indent + unit.toString());
        } else {
            Folder dir = (Folder) unit;
            Iterator<Unit> itr = dir.unitList.iterator();
            System.out.println(indent + " + " + unit);
            while(itr.hasNext()) {
                list("", itr.next());
            }
        }
    }

    public void list() {
        list("", this);
    }
}
