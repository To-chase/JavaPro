package com.thread.test3;

public class Steamed {
    private String name;
    private Integer flag;

    public Steamed(String name, Integer flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Steamed{" +
                "name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
