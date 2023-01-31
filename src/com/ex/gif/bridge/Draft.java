package com.ex.gif.bridge;

public class Draft {
    private String title;
    private String author;
    private String[] content;

    public Draft(String tilte, String author, String[] content) {
        this.title = tilte;
        this.author = author;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getContent() {
        return content;
    }

    public void print(Display display) {
        display.title(this);
        display.content(this);
        display.author(this);
    }
}
