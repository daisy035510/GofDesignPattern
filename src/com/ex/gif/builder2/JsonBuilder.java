package com.ex.gif.builder2;

public class JsonBuilder extends Builder{

    public JsonBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{";
    }

    @Override
    public String body() {

        StringBuffer sb = new StringBuffer();
        sb.append("\"Name\":");
        sb.append(data.getName());
        sb.append("\"Age\":");
        sb.append(data.getAge());

        return sb.toString();
    }

    @Override
    public String footer() {
        return "}";
    }
}
