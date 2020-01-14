package com.day08.day08.til8;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void word() {
        System.out.println("工号为"+this.getId()+"的助教，"+this.getName()+"在帮助学生解决问题 ");
    }
}
