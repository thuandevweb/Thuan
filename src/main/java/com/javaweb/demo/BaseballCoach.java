package com.javaweb.demo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run 50 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
