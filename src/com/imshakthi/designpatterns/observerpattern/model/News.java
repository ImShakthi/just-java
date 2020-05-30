package com.imshakthi.designpatterns.observerpattern.model;

import lombok.Getter;

@Getter
public class News {
    private final String title;
    private final String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
