package com.jojo.springdemo;

public class MinecraftCoach implements ICoach {

    private IFortuneService fortuneService;

    public MinecraftCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Workout: MinecraftCoach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
