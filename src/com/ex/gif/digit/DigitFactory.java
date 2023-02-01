package com.ex.gif.digit;

public class DigitFactory {

    private Digit[] pool = {null,null,null,null,null,null,null,null,null,null};

    public Digit getDigit(int n) {
        if(pool[n] != null) {
            return pool[n];
        } else {
            String fileNm = String.format("./data/%d.txt", n);
            Digit digit = new Digit(fileNm);
            pool[n] = digit;
            return digit;
        }
    }
}
