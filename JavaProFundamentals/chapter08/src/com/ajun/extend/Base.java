package com.ajun.extend;

public class Base {
    public int n1 = 1000;
    protected int n2 = 8993;
    int n3 = 9090;
    private int n4 = 93;

//    public Base() {
//        System.out.println("Base()构造器被调用");
//    }

    public Base(String name) {
        System.out.println("Base(name)构造器被调用");
    }

    public int getN1() {
        return n1;
    }

    protected int getN2() {
        return n2;
    }

    int getN3() {
        return n3;
    }

    private int getN4() {
        return n4;
    }
}
