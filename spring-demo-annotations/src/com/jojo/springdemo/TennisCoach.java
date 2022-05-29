package com.jojo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach{

    @Override
    public String getDailyWorkout() {
        return "Workout: TennisCoach";
    }
}
