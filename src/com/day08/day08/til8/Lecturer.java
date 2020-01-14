package com.day08.day08.til8;

public class Lecturer extends Teacher {
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void word() {
        System.out.println("工号为"+this.getId()+"的讲师，"+this.getName()+"在讲课");
    }
}
