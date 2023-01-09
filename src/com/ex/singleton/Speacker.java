package com.ex.singleton;

public class Speacker {
    // class 하나만 사용되어야하기 때문에
    static private Speacker instance;
    private int volume;

    private Speacker() {
        volume = 5;
    }
    public static Speacker getInstance(){

        if(instance == null) {
            System.out.println("새로 생성");
            instance = new Speacker();
        } else {
            System.out.println("이미 생성");
            instance = instance;
        }
        return instance;
    }

    public void setVolume(int n) {
        instance.volume = n;
    }

    public int getVolume() {
        return instance.volume;
    }
}
