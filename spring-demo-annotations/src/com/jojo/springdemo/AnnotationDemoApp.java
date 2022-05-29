package com.jojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICoach theCoach = context.getBean("lolCoach", ICoach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();

    }
}
