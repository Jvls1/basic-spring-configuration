package com.jojo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    public IFortuneService minecraftFortuneService() {
        return new MinecraftFortuneService();
    }

    @Bean
    public ICoach minecraftCoach() {
        return new MinecraftCoach(minecraftFortuneService());
    }
}
