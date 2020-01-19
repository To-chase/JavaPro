package com.day21.day21;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Title2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();
        Method method=list.getClass().getMethod("add",String.class);
        method.invoke(list,1);
        method.invoke(list,"java");
        method.invoke(list,2);
        System.out.println(list);

    }
}
