package com.ex.gif.template;

import java.util.List;

public class Article {

    private String title;
    private List<String> contents;
    private String footer;

    public Article(String title, List<String> contents, String footer) {
        this.title = title;
        this.contents = contents;
        this.footer = footer;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getContents() {
        return contents;
    }

    public String getFooter() {
        return footer;
    }
}
