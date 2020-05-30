package com.imshakthi.designpatterns.observerpattern.subscriber;

import com.imshakthi.designpatterns.observerpattern.publisher.NewsPublisher;

public class EmailSubscriber implements NewsSubscriber {
    private NewsPublisher newsPublisher;

    @Override
    public void update() {
        System.out.println(">>>Email: " + this.newsPublisher.getLatestNews());
    }

    @Override
    public void attach(NewsPublisher newsPublisher) {
        if (newsPublisher == null) {
            System.out.println("NEWS publisher is NULL");
            return;
        }
        this.newsPublisher = newsPublisher;
        this.newsPublisher.register(this);
        System.out.println("attach to publisher");
    }

    @Override
    public void detach() {
        if (newsPublisher == null) {
            System.out.println("NEWS publisher is NULL");
            return;
        }
        this.newsPublisher.unregister(this);
        this.newsPublisher = null;
        System.out.println("detached from publisher");
    }
}
