package com.javaweb.demo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Have a happy day!!";
    }
}
