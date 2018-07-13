package com.wsy.spring

import jdk.nashorn.internal.ir.Block
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created by IntelliJ IDEA.
 * User: wsy
 * Date: 2018-07-13
 * Time: 10:08
 */
class TestGroovy {

    def static pickEven(n, block) {
        for ( i in 1..n) {
            block(i)
        }

    }
    def static greeting = 'hello'     //第一行
    def static clos = {param->println "${greeting} ${param}" }

    static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "ApplicationContext.xml" );

        Object bean = applicationContext.getBean("helloGroovy")
        println(bean.test())


        pickEven(5,{
            println it
        })
        def n=1;
        def m=2;
        def m2 = "22"
        println("${n}+${m}="<<n.plus(m))

        clos("jiege")
    }
}
