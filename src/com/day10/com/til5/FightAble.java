package com.day10.com.til5;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通攻击");
    }
}
