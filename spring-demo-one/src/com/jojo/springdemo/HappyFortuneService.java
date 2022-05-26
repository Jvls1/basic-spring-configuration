package com.jojo.springdemo;

public class HappyFortuneService implements IFortuneService{

    @Override
    public String getFortune() {
        return "HappyFortuneService!";
    }
}
