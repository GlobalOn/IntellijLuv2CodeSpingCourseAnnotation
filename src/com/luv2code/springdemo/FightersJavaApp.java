package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FightersJavaApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FighterConfig.class);

        KarateCoach karateCoach = context.getBean("karateCoach", KarateCoach.class);

        System.out.println(karateCoach.getName());

        System.out.println(karateCoach.getFightStyle());

        System.out.println(karateCoach.getDailyWorkout());

        System.out.println(karateCoach.getDailyFortune());



    }
}
