package com.day03;

public class til6 {
    public static void main(String[] args){
         for(int i=1;i<=10;i++){
             for(int j=1;j<=10;j++){
                 if(j==i||j==(11-i)){
                     System.out.print("o");
                 }else{
                     System.out.print("*");
                 }
             }
             System.out.println();
         }
    }
}
