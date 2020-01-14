package com.day08.day08.til5;

public class Student extends Person{
    private double score;

    public Student(){

    }

    public Student(String name, double score) {
        this.setName(name);
        this.setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void results(){
        System.out.println(this.getName()+"同学，考试得了:"+this.getScore()+"分");
    }
}
