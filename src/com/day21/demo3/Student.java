package com.day21.demo3;

public class Student {
    private String name="马云";
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    private Student(String name) {
        this.name = name;
        System.out.println("有参构造"+name);
    }
    public void eat(){
        System.out.println("Public eat()");
    }

    public void eat(String name){
        System.out.println("Public eat(String name)"+name);
    }

    private void sleep(){
        System.out.println("Private sleep()");
    }

    private void sleep(String name){
        System.out.println("Private sleep(String name)"+name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
