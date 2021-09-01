package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class AnnotationJavaApp {
    public static void main(String[] args) {

        //Read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //logg info

        MyLoggerConfig logger = context.getBean("myLogger", MyLoggerConfig.class);
        try {
            logger.setRootLoggerLevel("FINEST");
            logger.setPrintedLoggerLevel("FINEST");

            logger.initLogger();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Get the bean from Spring container
//        MathTeacher tennisCoach = context.getBean("mathTeacher", MathTeacher.class);
        TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
//        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        //Call a method ot the bean
//        System.out.println(swimCoach.getDailyWorkout());
//        System.out.println(swimCoach.getDailyFortune());
//        System.out.println(swimCoach.getName());
//        System.out.println(swimCoach.getAddress());


        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        //Close context
        context.close();
    }
}
