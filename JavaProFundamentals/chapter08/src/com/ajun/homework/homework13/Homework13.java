package com.ajun.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        //测试老师
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();
        //测试
        Student student = new Student("小明", '男', 15, "00023102");
        System.out.println("-----------------------------------");
        student.printInfo();//封装
    }
}
