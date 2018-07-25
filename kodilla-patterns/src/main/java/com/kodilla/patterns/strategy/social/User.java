package com.kodilla.patterns.strategy.social;

public class User {
    private String name;
    protected SocialPublisher socialPublisher;

    public String getName() {
        return name;
    }

    public String sharePost() {
        return this.socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public User(String name) {
        this.name = name;
    }

}
