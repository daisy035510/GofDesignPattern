package com.ex.proxyPattern;

public class Proxy implements Subject {

    private Subject real;

    Proxy(Subject real) {
        this.real = new RequestSubject();
    }
    @Override
    public void doAction1() {
        System.out.println("간단한 업무 by 프록시");
    }

    @Override
    public void doAction2() {
       this.real.doAction2();
    }
}
