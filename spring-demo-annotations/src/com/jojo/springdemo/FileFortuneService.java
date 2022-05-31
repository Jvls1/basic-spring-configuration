package com.jojo.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class FileFortuneService implements IFortuneService {

    @Value("${file.fortune}")
    private String[] fortunes;

    @Override
    @PostConstruct
    public String getFortune() {
        System.out.println("Init");
        return fortunes[0];
    }
}
