/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testbean.MySpringWriterBeanWithDependency;

public class mainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        
        BeanFactory factory = context;
        
        MySpringWriterBeanWithDependency test = (MySpringWriterBeanWithDependency) factory
                .getBean("MySpringWriterBeanWithDependency");
        
        test.run();
    }
}