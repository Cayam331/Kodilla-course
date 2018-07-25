package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public String share(){
        return "favorite communication channel: SnapChat";
    }
}
