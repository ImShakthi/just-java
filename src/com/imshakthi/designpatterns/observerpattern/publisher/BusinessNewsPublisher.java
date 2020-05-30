package com.imshakthi.designpatterns.observerpattern.publisher;

import com.imshakthi.designpatterns.observerpattern.model.News;
import com.imshakthi.designpatterns.observerpattern.subscriber.NewsSubscriber;

import java.util.ArrayList;
import java.util.List;

public class BusinessNewsPublisher implements NewsPublisher {
    private final List<NewsSubscriber> subscribers;
    private News latestNews;

    public BusinessNewsPublisher() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void register(NewsSubscriber subscriber) {
        if (subscriber == null) {
            System.out.println("subscriber is NULL");
            return;
        }
        if (subscribers.contains(subscriber)) {
            System.out.println("already subscribed");
            return;
        }
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(NewsSubscriber subscriber) {
        if (subscriber == null) {
            System.out.println("subscriber is NULL");
            return;
        }
        if (!subscribers.contains(subscriber)) {
            System.out.println("subscribe is not register");
            return;
        }
        subscribers.remove(subscriber);
    }

    @Override
    public void publish() {
        System.out.printf("publishing to #%d subscribers\n", subscribers.size());
        subscribers.forEach(NewsSubscriber::update);
    }

    @Override
    public void addNews(News news) {
        if (news == null) {
            System.out.println("News is NULL");
            return;
        }
        this.latestNews = news;
    }

    @Override
    public News getLatestNews() {
        return this.latestNews;
    }
}
