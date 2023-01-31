package com.ex.gif.template;

public class CaptionDisplayArticle extends  DisplayArticleTemplate{

    public CaptionDisplayArticle(Article article) {
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("Title : " +  article.getTitle());
    }

    @Override
    protected void content() {
        System.out.println("Cotents : " +  article.getContents());
    }

    @Override
    protected void footer() {
        System.out.println("Footer : " + article.getFooter());
    }
}
