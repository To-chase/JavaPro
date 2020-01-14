package com.day11.til;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    private String id;
    private String name;
    private double price;
    private String unit;
    private int count;
    private double money;

    public Goods(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;

    }

    public Goods( String name, double price, int count,double money) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.money=money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

//    public List<Goods> addList(){
//        List<Goods> list=new ArrayList<>();
//        money=this.getCount()*this.getPrice();
//        list.add(new Goods(this.getName(), this.getPrice(), this.count, money));
//        return list;
//    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", count=" + count +
                ", money='" + money + '\'' +
                '}';
    }


}
