package com.day11.til;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class day11 {
    public static void main(String[] args) {
        System.out.println("请输入你的操作:"+"\n"+"1:购买商品"+"     "+"2:结算并打印小票"+"  3:退出系统");
        Scanner sc=new Scanner(System.in);
        List<Goods> list1=new ArrayList<>();
        while(true){
            int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("------------------------------------------------");
                List<Goods> list=new ArrayList<>();
                list.add(new Goods("001","少林核桃",15.5d,"斤"));
                list.add(new Goods("002","尚康饼干",14.5d,"包"));
                list.add(new Goods("003","移动硬盘",345d,"个"));
                list.add(new Goods("004","高清无码",199d,"G"));
                System.out.println("商品列表");
                System.out.println("商品id"+"   名称"+"    单价"+"      计价单位");
                System.out.println("001"+"   少林核桃"+"    15.5"+"      斤");
                System.out.println("002"+"   尚康饼干"+"    14.5"+"      包");
                System.out.println("003"+"   移动硬盘"+"    345.0"+"      个");
                System.out.println("004"+"   高清无码"+"    199.0"+"      G");
                System.out.println("------------------------------------------------");
                System.out.println("请输入你要购买的商品项(输入格式:商品id--购买数量),输入end购买结束");

                boolean flag=true;
                while(flag){
                    int index=0;
                    int rem=0;
                    String str=sc.next();
                    if(!str.equals("end")){
                        if(str.indexOf("-")>0){
                        String[] s=str.split("-");
                            for (Goods goods:list) {
                            if(s[0].equals(goods.getId())&&Integer.parseInt(s[1])>0){
                                   if(s[0].equals(goods.getId())){
                                       String name=goods.getName();
                                       double price=goods.getPrice();
                                       int count=Integer.parseInt(s[1]);
                                       double money=goods.getPrice()*count;
                                       Goods goods1=new Goods(name, price, count, money);
                                       list1.add(goods1);
                                       break;
                                   }

                            }else{
                                index++;
                                if(index==4){
                                    System.out.println("没有该类商品");
                                }
                            }
                        }
                        }else{
                            System.out.println("输入格式有误");
                        }
                    }else{
                        System.out.println("退出购买");
                        flag=false;
                    }
                }
                break;
            case 2:
                if(list1.size()!=0){
                System.out.println("欢迎光临");
                int count=0;
                double money=0;
                System.out.println("名称"+"         售价"+"      数量"+"        金额");
                for (Goods g:list1) {
                    count+=g.getCount();
                    money+=g.getMoney();
                    System.out.println(g.getName()+"     "+g.getPrice()+"         "+g.getCount()+"            "+g.getMoney());
                }
                System.out.println(list1.size()+"项商品");
                System.out.println("共计:"+count+"件");
                System.out.println("共:"+money);
                System.out.println("-------------------");
                }else{
                    System.out.println("该用户没有购买商品");
                }
                break;
            case 3:

                break;
//            case  4:
//                exit(0);
        }
        }
    }
}
