package com.jojo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach{

    @Autowired
    @Qualifier("fileFortuneService")
    private IFortuneService fortuneService;

    public TennisCoach() {
    }

    //    @Autowired
//    public TennisCoach(IFortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Workout: TennisCoach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(IFortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
}
