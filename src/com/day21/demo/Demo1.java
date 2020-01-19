package com.day21.demo;

import org.junit.*;

public class Demo1 {
    @Test
    public void print(){
        System.out.println("测试方法");
    }

    @Before
    public void beforePrint(){
        System.out.println("在每个测试方法之前都会运行一次 ");
    }

    @After
    public void afterPrint(){
        System.out.println("在每个测试方法运行以后运行的方法 ");
    }

    @BeforeClass
    public static void beforeStatic(){
        System.out.println("在所有的测试方法运行之前，运行一次，而且必须用在静态方法上面。 ");
    }
    @AfterClass
    public static void afterStatic(){
        System.out.println("在所有的测试方法运行以后，运行一次，而且必须用在静态方法上面。 ");
    }


}
