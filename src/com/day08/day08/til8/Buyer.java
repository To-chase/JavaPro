package com.day08.day08.til8;

public class Buyer extends  AdminStaff {
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void word() {
        System.out.println("工号为"+this.getId()+"的采购专员，"+this.getName()+"在采购音响设备 ");
    }
}
