package com.ex.gif.observer;

public class MainEntry {
    public static void main(String[] args) {

        DiceGame diceGame = new FairDiceGame();
        diceGame.addPlayer(new EvenBettingPlayer("evenPlay1"));
        diceGame.addPlayer(new OddBettingPlayer("evenPlay1"));
        diceGame.addPlayer(new OddBettingPlayer("evenPlay1"));

        diceGame.play();

    }
}
