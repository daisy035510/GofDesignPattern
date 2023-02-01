package com.ex.gif.singleton;

public class King {

    private static King self = null;

    private King() {

    }

    public static King getInstance() {
        if(self == null) {
            return new King();
        }

        return self;
    }

    public void say() {
        System.out.println("나는 왕이다");
    }
}
