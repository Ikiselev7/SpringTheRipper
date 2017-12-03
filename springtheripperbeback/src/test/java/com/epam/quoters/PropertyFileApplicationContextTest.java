package com.epam.quoters;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyFileApplicationContextTest {

    @Test
    public void test() throws Exception{
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Quoter.class).sayQuote();
    }

}