package com.jojo.springdemo;


import org.springframework.stereotype.Component;

@Component
public class LolCoach implements ICoach {

    IFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Workout: LolCoach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
