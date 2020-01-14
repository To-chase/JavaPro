package com.day09.Test2;

public class Test2 {
    public static void main(String[] args) {
//        Animal cat=new Cat();
//        cat.eat();
//        cat.run();
//        Animal dog=new Dog();
//        dog.eat();
//        Dog d=new Dog();
//        showDog(d);
//        Cat c=new Cat();
//        showCat(c);
//        System.out.println("-------------------");
//        Animal cat=new Cat();
//        showAnimal(cat);
//        Animal dog=new Dog();
//        showAnimal(dog);

        Animal a=new Cat();
        a.eat();
        if(a instanceof Cat){
            Cat c=(Cat) a;
            c.catMouse();
        }else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.watchHouse();
        }

    }

    public static void showDog(Dog dog){
        dog.eat();
    }
    public static void showCat(Cat cat){
        cat.eat();
    }

    public static void showAnimal(Animal animal){
        animal.eat();
    }
}
