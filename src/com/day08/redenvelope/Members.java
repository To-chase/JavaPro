package com.day08.redenvelope;

import java.util.ArrayList;

public class Members extends User {

    public Members() {
    }

    public Members(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public void closed(ArrayList<Double> redenvelope){
        double red=redenvelope.remove(0);
        setLeftMoney(getLeftMoney()+red);
    }

    @Override
    public void show() {
        System.out.println("群成员:"+this.getName()+",余额:"+this.getLeftMoney());
    }
}
