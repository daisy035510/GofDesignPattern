package com.ex.proxyPattern;

public class Main {
    public static void main(String[] args) {

        Subject real = new RequestSubject();
        Subject proxy = new Proxy(real);s

        proxy.doAction1();
        proxy.doAction2();
    }
}
