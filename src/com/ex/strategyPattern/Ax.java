package com.ex.strategyPattern;

public class Ax implements Weapon{
    @Override
    public int doAttack() {
        System.out.println("도끼 공격");
        return 0;
    }
}
