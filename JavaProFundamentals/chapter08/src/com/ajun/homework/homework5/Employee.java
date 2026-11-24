package com.ajun.homework.homework5;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printSal() {
        System.out.println("姓名：" + this.getName() + "，" + "工资：" + this.getSalary());
    }
}
