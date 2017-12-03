package com.epam.quoters;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;


public class TerminatorQuoterTest {


    @Test
    void tset() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
    }

}