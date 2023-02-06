package com.ex.gif.builder1;

public class Car {
    private String engine;
    private String airbag;
    private String color;
    private String cameraSensor;
    private String AEB;

    public Car(String engine, String airbag, String color, String cameraSensor, String AEB) {
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("ENGINE : " + engine  +"\n");
        sb.append("airbag : " + airbag  +"\n");
        sb.append("color : " + color  +"\n");
        sb.append("cameraSensor : " + cameraSensor  +"\n");
        sb.append("AEB : " + AEB  +"\n");

        return sb.toString();

    }
}
