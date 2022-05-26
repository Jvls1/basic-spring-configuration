package com.jojo.springdemo;

public class CricketCoach implements ICoach{

    private IFortuneService iFortuneService;
    private String emailAddress;
    private String team;


    public CricketCoach() {
        System.out.println("no-arg constructor");
    }

    public void setFortuneService(IFortuneService iFortuneService) {
        System.out.println("setter fortune service");
        this.iFortuneService = iFortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("setter email address");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("setter team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach";
    }

    @Override
    public String getDailyFortune() {
        return iFortuneService.getFortune();
    }
}
