package com.ll;

import java.util.ArrayList;

public class ArticleView {


    public void printDetail(Article article){

        System.out.println("제목 " + article.getTitle());
        System.out.println("내용 " + article.getBody());
        System.out.println("번호 " + article.getId());

    }
    public void printArticleList(ArrayList<Article> articleList){

        for (int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            System.out.println("번호 : " + article.getId());
            System.out.printf("제목%s:\n  ", article.getTitle());
            System.out.println("==================================");

        }

    }
}




