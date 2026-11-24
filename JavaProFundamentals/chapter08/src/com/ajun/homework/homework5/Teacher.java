package com.ajun.homework.homework5;

public class Teacher extends Employee{
    private double daySalary;
    private int day;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public void printSal() {
        System.out.println("教师：");
        System.out.println("姓名：" + this.getName() + "，" + "工资：" + this.getSalary() + this.getDay() * this.getDaySalary());
    }
}
