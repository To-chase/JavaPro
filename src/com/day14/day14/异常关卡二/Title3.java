package com.day14.day14.异常关卡二;

public class Title3 {
    public static void main(String[] args) {


        String name="admin1";
        String pwd="admin1";
//        System.out.println(!"admin".equals(name));
        try {
            login("adminqqq","asd");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd)throws LoginException{
        if(!"admin".equals(name)){
            throw new LoginException("用户名不存在");
        }
        if(!"admin".equals(pwd)){
            throw new LoginException("密码有误");
        }
        System.out.println("欢迎"+name);
    }
}
