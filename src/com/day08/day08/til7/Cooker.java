package com.day08.day08.til7;

public class Cooker extends Employee {
    public Cooker() {
    }

    public Cooker(String num, String name, double money) {
        super(num, name, money);
    }

    @Override
    public void world() {
        System.out.println("工号为:"+this.getNum()+"姓名为:"+this.getName()+"工资为:"+this.getMoney()+"的厨师在工作，炒菜");
    }

    @Override
    public void eat() {
        System.out.println("工号为:"+this.getNum()+"姓名为:"+this.getName()+"工资为:"+this.getMoney()+"的厨师在吃肉");
    }
}
