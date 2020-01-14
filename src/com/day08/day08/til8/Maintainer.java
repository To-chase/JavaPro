package com.day08.day08.til8;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void word() {
        System.out.println("工号为"+this.getId()+"的维护专员，"+this.getName()+"在解决不能共享屏幕问题 ");
    }
}
