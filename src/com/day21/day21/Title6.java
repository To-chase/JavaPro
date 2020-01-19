package com.day21.day21;

import java.lang.reflect.Field;

public class Title6 {

    public static void main(String[] args) {

    }
    public void setProperty(Object obj, String propertyName, Object value) throws Exception{
        Field f=obj.getClass().getDeclaredField(propertyName);
        f.setAccessible(true);
        f.set(obj,value);
        System.out.println(f.get(obj));
    }

    public Object getProperty(Object obj,String propertyName)throws Exception{
        Field f=obj.getClass().getDeclaredField(propertyName);
        String pro=(String) f.get(propertyName);
        return pro;
    }

}
