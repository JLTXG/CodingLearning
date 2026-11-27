package com.ajun.innerclass;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}

class Outer {
    private int n1 = 10;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void m1() {//方法
        System.out.println("m1()");
    }
    {//代码块
        System.out.println("代码块...");
    }
    class Inner { //内部类, 在Outer类的内部

    }
}
