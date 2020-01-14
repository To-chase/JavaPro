package com.day08.day08.til5;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(String name,  String subject) {
        this.setName(name);
        this.setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println(this.getName()+"老师,讲授"+this.getSubject()+"课");
    }
}
