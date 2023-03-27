package com.ex.gif.template;

import java.util.Arrays;
import java.util.List;

public class MainEntry {
    public static void main(String[] args) {

        String head = "head";
        List<String> contents = Arrays.asList("contents");
        String footer = "footer";


        Article article = new Article(head, contents, footer);


        DisplayArticleTemplate template = new CaptionDisplayArticle(article);
        template.display();
    }
}
