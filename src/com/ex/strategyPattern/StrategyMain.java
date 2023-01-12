package com.ex.strategyPattern;

public class StrategyMain {

    public static void main(String[] args) {

        GameCharacter character = new GameCharacter();

        character.doAttack();

        character.setWeapon(new Knife());
        character.doAttack();

        character.setWeapon(new Sword());
        character.doAttack();

        character.setWeapon(new Ax());
        character.doAttack();

    }
}
