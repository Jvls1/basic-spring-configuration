package com.jojo.springdemo;


import org.springframework.stereotype.Component;

@Component
public class LolCoach implements ICoach {


    @Override
    public String getDailyWorkout() {
        return "Workout: LolCoach";
    }
}
