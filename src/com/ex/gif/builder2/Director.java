package com.ex.gif.builder2;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }


    public String build() {

        StringBuffer sb = new StringBuffer();
        sb.append(builder.head());
        sb.append(builder.body());
        sb.append(builder.footer());
        return sb.toString();
    }
}
