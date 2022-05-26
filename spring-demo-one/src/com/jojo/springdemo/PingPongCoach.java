package com.jojo.springdemo;

public class PingPongCoach implements ICoach{

    private IFortuneService iFortuneService;

    public PingPongCoach(IFortuneService iFortuneService) {
        this.iFortuneService = iFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "PingPong";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
