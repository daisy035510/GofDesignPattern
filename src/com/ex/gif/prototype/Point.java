package com.ex.gif.prototype;

public class Point implements Shape, Prototype{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public Object copy() {
        Point newPoint  = new Point();
        newPoint.x = this.x;
        newPoint.y = this.y;

        return newPoint;
    }

    @Override
    public String draw() {
        return "(" + this.x + ", " + this.y +")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
