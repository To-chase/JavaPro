package com.day09.day09;

import com.day09.day09.til5.Animal;
import com.day09.day09.til5.Cat;
import com.day09.day09.til5.Dog;

public class Test5 {
    public static void main(String[] args) {
        Animal a=new Cat();
        Animal a1=new Dog();
        a.eat();
        a1.eat();
        System.out.println("---------------");
        animalShow(a);
        animalShow(a1);
    }

    public static void animalShow(Animal a){
        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.catchMouse();
        }else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.lookHouse();
        }
    }
}
