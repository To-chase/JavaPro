package com.day21.day21;

import java.lang.reflect.Field;

public class Title7 {
    public static void main(String[] args) throws Exception {
        Class<Person> c=Person.class;
        Person p=c.newInstance();
        p.setName("马云");
        Field m1=c.getDeclaredField("age");
        m1.setAccessible(true);
        m1.set(p,50);
        Object obj=m1.get(p);
        System.out.println(p);
    }
}
