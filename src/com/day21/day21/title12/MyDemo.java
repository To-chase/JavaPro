package com.day21.day21.title12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MyDemo {
    public static void main(String[] args) throws Exception {
//        Class<Show> c = Show.class;
//        Method method = c.getMethod("show");
////        if(method.isAnnotationPresent(Book.class)){
//        Book b = method.getAnnotation(Book.class);
//        String value = b.value();
//        double price = b.price();
//        String[] author = b.authors();
//        System.out.println(value);
//        System.out.println(price);
//        System.out.println(Arrays.toString(author));
//        }
        get();

    }

    public static void get()throws Exception{
        Class<Show> c=Show.class;
        Book book=c.getAnnotation(Book.class);
        if(c.isAnnotationPresent(Book.class)){
            String value=book.value();
            double price=book.price();
            String[] author=book.authors();
            System.out.println(value+","+price);
            System.out.println(Arrays.toString(author));

        }
    }

}
