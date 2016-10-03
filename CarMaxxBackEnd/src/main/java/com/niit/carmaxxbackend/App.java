package com.niit.carmaxxbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ob = new  AnnotationConfigApplicationContext();
       System.out.println("one");
        ob.scan("com.CarMaxxBackEndconfig");
        System.out.println("two");
        ob.refresh();
        System.out.println("three");
    }
}
