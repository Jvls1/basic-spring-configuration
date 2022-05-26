package com.jojo.springdemo;

public class BaseballCoach implements ICoach {

    private IFortuneService iFortuneService;

    public BaseballCoach(IFortuneService iFortuneService) {
        this.iFortuneService = iFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "BaseballCoach";
    }

    @Override
    public String getDailyFortune() {
        return iFortuneService.getFortune();
    }
}
