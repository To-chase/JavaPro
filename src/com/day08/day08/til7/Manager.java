package com.day08.day08.til7;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String num, String name, double money) {
        super(num, name, money);
    }

    @Override
    public void world() {
        System.out.println("工号为:"+this.getNum()+"姓名为:"+this.getName()+"工资为:"+this.getMoney()+"的经理在管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("工号为:"+this.getNum()+"姓名为:"+this.getName()+"工资为:"+this.getMoney()+"的经理在吃鱼");
    }
}
