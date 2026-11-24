package com.ajun.homework;

public class SavingsAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void earnMonthlyInterest() {//每个月初，我们统计上个月的利息，同时将count=3
        count = 3;//
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);//1 块转入银行
        }
        count--;//减去一次
    }

    @Override
    public void withdraw(double amount) {//取款
        //判断是否还可以免手续费
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);//1 块转入银行
        }
        count--;
    }
}
