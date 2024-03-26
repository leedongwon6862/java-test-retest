package com.ll;

public class Article {

    private int id;
    private String title;
    private String body;
    private int hit;
    private String regDate;

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Article(int id, String title, String body, int hit, String regDate) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.hit = hit;
        this.regDate = regDate;
    }
}
