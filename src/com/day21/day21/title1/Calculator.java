package com.day21.day21.title1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator {

    @BeforeClass
    public static void  beforeTest(){
        Calculator calculator=new Calculator();
        System.out.println(calculator);
    }

    @AfterClass
    public static void  afterTest(){
        Calculator calculator=null;
        System.out.println(calculator);
    }
    @Test
    public void sum(){
        System.out.println("加");
    }

    @Test
    public void lose(){
        System.out.println("减法");
    }
    @Test
    public void multiply(){
        System.out.println("乘法");
    }
    @Test
    public void divide(){
        System.out.println("除法");
    }


}
