package com.ex.gif.builder1;

public class CarBuilder {
    private String engine;
    private String airbag;
    private String color;
    private String cameraSensor;
    private String AEB;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setAirbag(String airbag) {
        this.airbag = airbag;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setCameraSensor(String cameraSensor) {
        this.cameraSensor = cameraSensor;
        return this;
    }

    public CarBuilder setAEB(String AEB) {
        this.AEB = AEB;
        return this;
    }

    public Car build() {
        return new Car(engine, airbag, color, cameraSensor, AEB);
    }
}
