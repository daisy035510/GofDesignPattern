package com.ex.gif.builder2;

public class XMLBuilder extends Builder{
    public XMLBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        StringBuffer sb = new StringBuffer();
        sb.append("<DATA>");
        return sb.toString();
    }

    @Override
    public String body() {

        StringBuffer sb = new StringBuffer();
        sb.append("<NAME>");
        sb.append(data.getName());
        sb.append("</NAME>");
        sb.append("<AGE>");
        sb.append(data.getAge());
        sb.append("</AGE>");

        return sb.toString();
    }

    @Override
    public String footer() {
        return "</DATA>";
    }
}
