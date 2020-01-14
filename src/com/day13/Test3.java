package com.day13;

public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6,7};
        System.out.println(getSum(arr));
        System.out.println(getSum1(arr));
    }
    public static int getSum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static int getSum1(int...arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

}
