package com.ajun.homework;

public class Manager extends Employee {
    // 特有属性
    private double bonus;

    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        //因为经理的工资计算方式和Employee不一样，所以我们重写
        System.out.println("经理 " + getName() + " 工资是="
                + (bonus + getDaySal() * getWorkDays() * getGrade()));
    }
}
