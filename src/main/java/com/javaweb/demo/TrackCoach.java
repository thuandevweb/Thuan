package com.javaweb.demo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run 100 km";
    }

    @Override
    public String getDailyFortune() {
        return "hello" + fortuneService.getFortune();
    }

    public void initMethod() {
        System.out.println("Hello");
    }

    public void destroyMethod() {
        System.out.println("Bye");
    }
}
