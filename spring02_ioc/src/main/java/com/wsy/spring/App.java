package com.wsy.spring;

import com.wsy.spring.bean.SomeBean;
import com.wsy.spring.bean.SomeBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

     /*   SomeBean someBean = (SomeBean) ac.getBean( "someBean" );
        System.out.println(someBean);*/

        Object someBean1 = ac.getBean( "someBean1" );
        System.out.println(someBean1);

        Object someBean2 = (SomeBean) ac.getBean( "someBean2" );
        System.out.println(someBean2);


    }
}
