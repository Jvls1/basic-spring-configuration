package com.jojo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton") //this is the default scope
public class TennisCoach implements ICoach{

    @Autowired
    @Qualifier("fileFortuneService")
    private IFortuneService fortuneService;

    public TennisCoach() {
    }

//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("TennisCoach: doMyStartupStuff");
//    }
//
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("TennisCoach: doMyCleanupStuff");
//    }

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
