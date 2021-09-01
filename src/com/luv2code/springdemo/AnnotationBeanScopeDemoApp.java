package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if the previous beans are the same
        boolean pointingToTheSameObject = tennisCoach == alphaCoach;
        boolean objectsAreTheSame = tennisCoach.equals(alphaCoach);
        System.out.println("The objects pointing to the same area of memory = " + pointingToTheSameObject);
        System.out.println("The objects are the same = " + objectsAreTheSame);
        System.out.println("Tennis coach bean = " + tennisCoach);
        System.out.println("Alpha coach bean = " + alphaCoach);

        context.close();
    }
}
