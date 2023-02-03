package com.ex.gif.memento;

import java.util.ArrayList;
import java.util.List;

public class Walker implements Cloneable {

    private int currentX, currentY;
    private int targetX, targetY;
    private ArrayList<String> actionList = new ArrayList<>();

    public Walker(int currentX, int currentY, int targetX, int targetY, ArrayList<String> actionList) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.targetX = targetX;
        this.targetY = targetY;
        this.actionList = actionList;
    }

    public double add(String action) {

        List<String> actionList = new ArrayList<>();
        actionList.add(action);

        if("UP".equals(action)) {
            this.currentY += 1;
        } else if("DOWN".equals(action)) {
            this.currentY -= 1;
        } else if("LEFT".equals(action)) {
            this.targetX -= 1;
        } else if("RIGHT".equals(action)) {
            this.targetX += 1;
        }

        // 현재 거리에서 목표좌표까지 거라 반환
        return Math.sqrt(Math.pow(currentX - currentY, 2) + Math.pow(targetX - targetY, 2));
    }

    private class Memento {
        private int x, y;
        private ArrayList<String> actionList;
        private Memento() {};
    }

    public Memento createMemneto() {

        Memento memento = new Memento();
        memento.x = this.currentX;
        memento.y = this.currentY;
        memento.actionList = (ArrayList<String>) this.actionList.clone();

        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.currentX = memento.x;
        this.currentY = memento.y;
        this.actionList = memento.actionList;
    }

    @Override
    public String toString() {
        return actionList.toString();
    }
}
