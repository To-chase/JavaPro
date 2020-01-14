package com.day14.day14.异常关卡二;

public class Son extends Father {
    //抛出与父类平级的其他异常。
//    @Override
//    public void eat() throws TonguePainException {
//        super.eat();
//    }

    //抛出比父类高级的异常
//    @Override
//    public void eat() throws PainExecption {
//        super.eat();
//    }


    //可以抛出和父类同样的异常
//    @Override
//    public void eat() throws ToothPainException {
//        super.eat();
//    }


    //抛出父类抛出异常的子类异常
//    @Override
//    public void eat() throws BigToothPainException {
//
//    }

    //父类抛出异常的子类异常
//    @Override
//    public void eat() throws BigToothPainException,FrontToothPainExcption {
//
//    }


    //父类不抛出异常,子类也不能抛出异常(编译时异常)
//    @Override
//    public void drink() throws BigToothPainException{
//        super.drink();
//    }


//    @Override
//    public void drink() throws TonguePainException{
//        System.out.println("喝了100度的水");
//          TonguePainException t=new TonguePainException("舌头疼");
//    }


    @Override
    public void drink() {
        try {
            int a=0;
            if(a==-1){
                throw new TonguePainException();
            }
            System.out.println("喝了100度的水");
        } catch (TonguePainException e) {
            System.out.println("在疼都要忍着不能说,因为你爸都不说,你也不能说");
        }

    }
}
