package com.imshakthi.designpatterns.observerpattern.publisher;

import com.imshakthi.designpatterns.observerpattern.model.News;
import com.imshakthi.designpatterns.observerpattern.subscriber.NewsSubscriber;

public interface NewsPublisher {
    void register(NewsSubscriber subscriber);

    void unregister(NewsSubscriber subscriber);

    void publish();

    void addNews(News news);

    News getLatestNews();
}
