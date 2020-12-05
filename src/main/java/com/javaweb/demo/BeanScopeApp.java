package com.javaweb.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean check = (theCoach == alphaCoach);

        System.out.println(check);
        System.out.println(theCoach);
        System.out.println(alphaCoach);

        context.close();
    }
}
