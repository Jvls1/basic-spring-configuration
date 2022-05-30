package com.jojo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService{

    @Override
    public String getFortune() {
        return "HappyFortuneService";
    }
}
