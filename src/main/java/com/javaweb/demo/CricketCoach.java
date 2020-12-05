package com.javaweb.demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Set email");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Set team");
        this.team = team;
    }

    public CricketCoach() {
        System.out.println("No-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice for 20 minute";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
