package com.day14.day14.异常关卡二;

public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) throws NoLifeValueExption {
        this.name = name;
        if(lifeValue<0){
           throw  new NoLifeValueExption("生命值不能为负数:"+lifeValue);

        }else{
            this.lifeValue = lifeValue;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws NoLifeValueExption {
        if(lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数:"+lifeValue);
        }else{
            this.lifeValue = lifeValue;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
