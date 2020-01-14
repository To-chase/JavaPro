package com.day10.Demo;

public class Test2 {
    public static void main(String[] args) {
        SunShu sunShu=new SunShu() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

//        System.out.println(sunShu.sum(3,5));

        int sum=sum(9,4,(aa,bb)->{
            return aa+bb;
        });

        System.out.println("Lambda求和:"+sum);

    }

    public static int sum(int a,int b,SunShu sunShu){
        return sunShu.sum(a,b);
    }
}
