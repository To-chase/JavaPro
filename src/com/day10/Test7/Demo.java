package com.day10.Test7;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        Person[] array={
               new Person("amy",12),
                new Person("amy1",34),
                new Person("amy2",16),
        };

//        Comparator<Person> comparator=new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        };
////        System.out.println(Arrays.toString(array));
//        Arrays.sort(array,comparator);
//        for (Person person:array){
//            System.out.println(person);
//        }
        Arrays.sort(array,(Person o1,Person o2)->{
             return o1.getAge()-o2.getAge();
        });

        for (Person person:array){
            System.out.println(person);
        }
    }
}
