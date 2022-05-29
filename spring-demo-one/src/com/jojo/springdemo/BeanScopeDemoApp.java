package com.jojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("\nResult: "+result);
        System.out.println("\nMemory location: "+theCoach);
        System.out.println("\nMemory location: "+alphaCoach);

        context.close();
    }
}
