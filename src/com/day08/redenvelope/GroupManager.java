package com.day08.redenvelope;

import java.util.ArrayList;

public class GroupManager extends User{
    public GroupManager() {
    }

    public GroupManager(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList<Double> fa(double redenvelope,int count){
        ArrayList<Double> list=new ArrayList<>();
        this.setLeftMoney(this.getLeftMoney()-redenvelope);
         for(int i=0;i<count;i++){
             list.add(redenvelope/count);
         }
         return list;
    }

    @Override
    public void show() {
        System.out.println("群主:"+this.getName()+",余额:"+this.getLeftMoney());
    }
}
