package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JumpJavaConfigDemoApp {
    public static void main(String[] args) {

        //Read Spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //Get the bean from Spring container
        JumpCoach jumpCoach = context.getBean("jumpCoach", JumpCoach.class);

        System.out.println(jumpCoach.getDailyWorkout());
        System.out.println(jumpCoach.getDailyFortune());
        System.out.println(jumpCoach.getName());
        System.out.println(jumpCoach.getAddress());
        System.out.println(jumpCoach.getTeam());

        //Close context
        context.close();
    }
}
