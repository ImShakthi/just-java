package com.imshakthi.designpatterns.observerpattern.subscriber;

import com.imshakthi.designpatterns.observerpattern.publisher.NewsPublisher;

public interface NewsSubscriber {
    void update();

    void attach(NewsPublisher newsPublisher);

    void detach();
}
