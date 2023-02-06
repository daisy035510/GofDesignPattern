package com.ex.gif.builder2;

public class MainEntry {

    public static void main(String[] args) {

        Data data = new Data("Jane", 25);
        Builder builder = new JsonBuilder(data);
        Director director = new Director(builder);

        String rslt = director.build();
        System.out.println(rslt);

    }
}
