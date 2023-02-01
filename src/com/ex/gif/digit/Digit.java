package com.ex.gif.digit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {

    private ArrayList<String> data = new ArrayList<>();

    public Digit(String fileNm) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileNm);
            br = new BufferedReader(fr);

            for(int i = 0; i < 5; i++){
                data.add(br.readLine());
            }
        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (br != null) br.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public void print(int x, int y) {
        for(int i = 0; i < 8; i++) {
            String line = data.get(i);
            System.out.println(line);
        }
    }
}
