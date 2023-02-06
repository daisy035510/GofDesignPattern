package com.ex.gif.prototype;

public class MainEntry {
    public static void main(String[] args) {

        Point pt1 = new Point();
        pt1.setX(0).setY(0);
        System.out.println(pt1.draw());

        Point pt2 = new Point();
        pt2.setX(100).setY(0);
        System.out.println(pt2.draw());

        Line line1 = new Line();
        line1.setStartPt(pt1).setEndPt(pt2);
        System.out.println(line1.draw());

    }
}
