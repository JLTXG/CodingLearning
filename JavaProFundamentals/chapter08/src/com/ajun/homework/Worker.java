package com.ajun.homework;

public class Worker extends Employee {
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.print("普通员工 ");//自己的输出信息
        super.printSal();//调用父类的方法，复用代码
    }
}
