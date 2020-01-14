package com.day08.day08.til7;

public abstract class Employee {
    private String num;
    private String name;
    private double money;

    public Employee(){

    }

    public Employee(String num,String name,double money){
        this.setNum(num);
        this.setName(name);
        this.setMoney(money);
    }

    public String getNum(){
        return num;
    }

    public void setNum(String num){
        this.num=num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract void world();
    public abstract void eat();
}
