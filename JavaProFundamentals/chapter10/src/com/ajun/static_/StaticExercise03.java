package com.ajun.static_;

public class StaticExercise03 {
}

class Person1 { //StaticExercise03.java 2min 看
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        // this.total = total;//错误，因为在static方法中，不可以使用this 关键字

        Person1.total = total;
    }
    public Person1() {//构造器
        total++;
        id = total;
    }
    //编写一个方法，输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}
class TestPerson1 {
    public static void main(String[] args) {

        Person1.setTotalPerson(3);
        new Person1(); //最后 total的值就是4
        Person1.m();//看看输出的是不是4
    }
}
