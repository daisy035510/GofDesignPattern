package com.ex.gif.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class DiceGame {
    protected List<Player> playerList = new LinkedList<>();

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public abstract void play();
}
