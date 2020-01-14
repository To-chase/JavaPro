package com.day14.day14.异常关卡一;

public class Student {
    private String num;
    private String name;
    private Double score;

    public Student(String num, String name, Double score) throws NoScoreException {
        this.num = num;
        this.name = name;
        if(score<0){
            throw new NoScoreException("分数不能为负数:"+score);
        }else {
            this.score = score;
        }
    }

    public Student() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score)throws NoScoreException {
        if(score<0){
            throw new NoScoreException("分数不能为负数:"+score);
        }else {
            this.score = score;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
