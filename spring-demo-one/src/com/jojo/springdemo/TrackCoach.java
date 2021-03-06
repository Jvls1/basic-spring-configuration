package com.jojo.springdemo;

public class TrackCoach implements ICoach {

    private IFortuneService iFortuneService;

    public void init() {
        System.out.println("TrackCoach: init");
    }

    public void destroy() {
        System.out.println("TrackCoach: destroy");
    }

    public TrackCoach() {

    }

    public TrackCoach(IFortuneService iFortuneService) {
        this.iFortuneService = iFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TrackCoach";
    }

    @Override
    public String getDailyFortune() {
        return "Track Coach: "+iFortuneService.getFortune();
    }
}
