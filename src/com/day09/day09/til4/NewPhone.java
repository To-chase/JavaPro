package com.day09.day09.til4;

public class NewPhone extends OldPhone implements Play {
    @Override
    public void call() {
        System.out.println("新手机能打电话");
    }

    @Override
    public void senfMessage9() {
        System.out.println("新手机能发短信");
    }

    @Override
    public void playGames() {
        System.out.println("新手机可以玩游戏");
    }
}
