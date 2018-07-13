package com.wsy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-13
 * Time: 9:59
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "ApplicationContext.xml" );

        HelloWorld hello = (HelloWorld) applicationContext.getBean( "hello" );
        System.out.println( hello.someMethod() );

    }
}
