package com.ajun.extend;

public class Pupil extends Student{
    public Pupil(String name, int age, double score) {
        super(name, age, score);
    }

    public void testing() {
        System.out.println("继承1：小学生");
    }
}
