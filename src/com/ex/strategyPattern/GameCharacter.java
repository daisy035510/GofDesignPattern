package com.ex.strategyPattern;

public class GameCharacter {
    Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int doAttack() {

        if(this.weapon == null) {
            System.out.println("맨손공격s");
            return 0;
        }
        return weapon.doAttack();
    }
}
