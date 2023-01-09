package com.ex.factory;

public class Bow implements Item{
    @Override
    public void use() {
        System.out.println("활을 사용했다");
    }
}
