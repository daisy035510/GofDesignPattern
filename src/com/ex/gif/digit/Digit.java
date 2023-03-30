package com.ex.gif.digit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {

    private ArrayList<String> data = new ArrayList<>();

    public Digit(String fileNm) {

        try(BufferedReader br = new BufferedReader(new FileReader(fileNm))) {
            for(int i = 0; i < 5; i++){
                data.add(br.readLine());
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void print(int x, int y) {
        for(int i = 0; i < 8; i++) {
            String line = data.get(i);
            System.out.println(line);
        }
    }
}
