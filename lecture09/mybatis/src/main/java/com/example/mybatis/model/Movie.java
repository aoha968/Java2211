package com.example.mybatis.model;

public class Movie {
    private int id;
    private String name;
    private int publishedYear;

    /**
     * コンストラクタ
     */
    public Movie(int id, String name, int publishedYear) {
        this.id = id;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    /**
     * ゲッター
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
