package com.ajun.homework.homework5;

public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void printSal() {
        System.out.println("服务生：");
        super.printSal();
    }
}
