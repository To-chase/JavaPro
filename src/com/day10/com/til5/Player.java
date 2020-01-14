package com.day10.com.til5;

public class Player {
    FightAble select(String str){
        if("武力角色".equals(str)){
            return new Warrior();
        }else if("法力角色".equals(str)){
            return new Mage();
        }
        return null;
    }

}
