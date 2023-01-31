package com.ex.gif.bridge;

public class Publication extends Draft{

    private String publisher;
    private int cost;

    public Publication(String tilte, String author, String[] content, String publisher, int cost) {
        super(tilte, author, content);
        this.publisher = publisher;
        this.cost = cost;
    }

    public void printPublicationInfo() {
        System.out.println("publisher : " + this.publisher + ", cost: $ " + this.cost);
    }

    public void print(Display display) {
        super.print(display);
        printPublicationInfo();
    }
}
