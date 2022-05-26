package com.jojo.springdemo;

import java.util.Random;

public class RandomFortuneService implements IFortuneService{

    private String[] data = {
            "1",
            "2",
            "3"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}
