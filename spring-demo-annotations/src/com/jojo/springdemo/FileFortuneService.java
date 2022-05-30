package com.jojo.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements IFortuneService {

    @Value("${file.fortune}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        return fortunes[0];
    }
}
