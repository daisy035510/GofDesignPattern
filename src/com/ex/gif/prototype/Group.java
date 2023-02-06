package com.ex.gif.prototype;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Prototype, Shape{

    private ArrayList<Shape> shapeList = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    Group addShape(Shape shape) {
        shapeList.add(shape);
        return this;
    }


    @Override
    public Object copy() {
        Group newGroup = new Group(name);

        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()) {
            Prototype shape = (Prototype) itr.next();
            newGroup.shapeList.add((Shape) shape.copy());
        }

        return newGroup;
    }

    @Override
    public String draw() {

        StringBuffer stringBuffer = new StringBuffer(name);
        stringBuffer.append("(");

        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()) {
            Shape shape = itr.next();
            stringBuffer.append(shape.draw());
            if(itr.hasNext()) {
                stringBuffer.append(" ");
            }
        }

        stringBuffer.append(")");

        return stringBuffer.toString();
    }

    @Override
    public void moveOffset(int dx, int dy) {

        Iterator<Shape> itr = shapeList.iterator();
        while(itr.hasNext()) {
            Shape shape =  itr.next();
            shape.moveOffset(dx, dy);
        }
    }
}
