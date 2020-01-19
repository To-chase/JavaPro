package com.day21.demo6;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyDemo {

    @Test
    public void test3(){
        try {
            Class<com.day21.demo6.Test> t=com.day21.demo6.Test.class;
            Field field= t.getDeclaredField("name");
            Myruntil my=field.getAnnotation(Myruntil.class);
            if(field.isAnnotationPresent(Myruntil.class)){
                System.out.println(my.name());
                System.out.println(my.price());
            }else{
                System.out.println("---");
            }
        }  catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try {
            Class<com.day21.demo6.Test> t=com.day21.demo6.Test.class;
            Method method =t.getDeclaredMethod("open");
            Myruntil my=method.getAnnotation(Myruntil.class);
            if(method.isAnnotationPresent(Myruntil.class)){
                System.out.println(my.name());
                System.out.println(my.price());
            }else{
                System.out.println("---");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){
        Class<com.day21.demo6.Test> t=com.day21.demo6.Test.class;
        Myruntil my=t.getAnnotation(Myruntil.class);
        if(t.isAnnotationPresent(Myruntil.class)){
            System.out.println(my.name());
            System.out.println(my.price());
        }else{
            System.out.println("---");
        }
    }
}
