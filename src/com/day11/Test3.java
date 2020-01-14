package com.day11;

public class Test3 {
    //== 比较内存地址，比较的是对象
    //equals  比较的是对象
    public static void main(String[] args) {
        Person p=new Person("Ma",12);
        Person p2=new Person("NB",12);

        System.out.println(p.equals(p2));
        System.out.println("Ma".hashCode());
        System.out.println("NB".hashCode());
    }
}
