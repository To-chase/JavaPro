package com.day14.day14.异常关卡三;

public class DebitCard {
    private String accountNumber;
    private double money;

    public DebitCard(String accountNumber, double money) throws DebitCardException{
        this.accountNumber = accountNumber;
        if(money<0){
            throw new  DebitCardException("余额无法为负数");
        }
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) throws DebitCardException {
        if(money<0){
            throw new  DebitCardException("余额无法为负数");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "accountNumber='" + accountNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
