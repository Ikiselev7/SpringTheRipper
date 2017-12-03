package com.epam.quoters;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;


public class TerminatorQuoterTest {


    @Test
    public void test() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while(true){
            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuote();
        }
    }

}