package com.ex.gif.digit;

import java.util.ArrayList;

public class Number {
    private ArrayList<Digit> digitList = new ArrayList<>();

    public Number(int n) {
        String strNum = Integer.toString(n);
        int len = strNum.length();

        DigitFactory digitFactory = new DigitFactory();
        for(int i = 0; i < len; i++) {

            int number = Character.getNumericValue(strNum.charAt(i));
            Digit digit = digitFactory.getDigit(number);
            digitList.add(digit);
        }
    }

    public void print() {
        int cntDigit = digitList.size();
        for(int i = 0; i < cntDigit; i++) {
            Digit digit = digitList.get(i);
            digit.print(0,0);
        }
    }

}
