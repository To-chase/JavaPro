package com.day10.Red;

public class Qunzhu {
    private String name="群主大大";

    private OpenMoney openMoney;

    public Qunzhu(String name, OpenMoney openMoney) {
        this.name = name;
        this.openMoney = openMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpenMoney getOpenMoney() {
        return openMoney;
    }

    public void setOpenMoney(OpenMoney openMoney) {
        this.openMoney = openMoney;
    }
}
