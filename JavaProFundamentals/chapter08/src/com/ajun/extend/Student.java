package com.ajun.extend;

public class Student {
    public String name;
    public int age;
    private double score;

    public Student(String name, int age, double score) {
        this.setName(name);
        this.setAge(age);
        this.setScore(score);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生信息如下：" + name + "，" + age + "，" + score);
    }
}
