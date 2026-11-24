package com.ajun.homework.homework5;

public class Scientist extends Employee{
    private double yearEndBonus;

    public Scientist(String name, double salary) {
        super(name, salary);
    }

    public double getYearEndBonus() {
        return yearEndBonus;
    }

    public void setYearEndBonus(double yearEndBonus) {
        this.yearEndBonus = yearEndBonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家：");
        System.out.println("姓名：" + this.getName() + "，" + "工资：" + this.getSalary() + this.getYearEndBonus());
    }
}
