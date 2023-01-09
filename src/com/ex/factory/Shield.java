package com.ex.factory;

public class Shield implements Item{
    @Override
    public void use() {
        System.out.println("방패를 사용했다");
    }
}
