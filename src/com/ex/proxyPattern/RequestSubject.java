package com.ex.proxyPattern;

public class RequestSubject implements Subject {


    @Override
    public void doAction1() {
        System.out.println("간단한 업무 by real");
    }

    @Override
    public void doAction2() {
        System.out.println("복잡한 업무 by real");
    }
}
