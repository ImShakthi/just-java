package com.imshakthi.designpatterns.observerpattern;

import com.imshakthi.designpatterns.observerpattern.model.News;
import com.imshakthi.designpatterns.observerpattern.publisher.BusinessNewsPublisher;
import com.imshakthi.designpatterns.observerpattern.subscriber.SmsSubscriber;

public class InitObserver {
    public static void main(String[] args) {
        System.out.println("Observer pattern");

        // publisher
        BusinessNewsPublisher publisher = new BusinessNewsPublisher();

        SmsSubscriber smsSubscriber1 = new SmsSubscriber();
        SmsSubscriber smsSubscriber2 = new SmsSubscriber();
        SmsSubscriber smsSubscriber3 = new SmsSubscriber();

        smsSubscriber1.attach(publisher);
        smsSubscriber2.attach(publisher);
        smsSubscriber3.attach(publisher);

        News news = new News("title 1", "content 1");
        publisher.addNews(news);
        publisher.publish();

        smsSubscriber2.detach();

        news = new News("title 2", "content 2");
        publisher.addNews(news);
        publisher.publish();
    }
}
