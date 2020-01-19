package com.day21.day21;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Title4 {
    public static void main(String[] args) {
        Class<Show> s=Show.class;
        try {
            String str="helloword,你好世界!";
            Show show=s.newInstance();
            Method method=s.getMethod("show",String.class);
            method.invoke(show,str);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
