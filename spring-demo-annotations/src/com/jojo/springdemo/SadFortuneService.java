package com.jojo.springdemo;

public class SadFortuneService implements IFortuneService{

    @Override
    public String getFortune() {
        return "SadFortuneService";
    }
}
