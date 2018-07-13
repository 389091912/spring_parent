package com.wsy.spring.bean;

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-13
 * Time: 11:31
 */
public class SomeBeanFactory {
    public static SomeBean getSomeBean() {
        return new SomeBean( 123, "mike" );

    }
    public static String getStr() {
        return "hello itany";
    }
    public SomeBean getBean(){
        return  new SomeBean(2,"hello");
    }
}
