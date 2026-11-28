package com.ajun.Homework01;

public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String NAME = "xixixixixi";
    public void f1() {
        class B {
            private final String NAME = "hhhhhhhhhhhhh";
            public void show() {
                System.out.println("NAME = " + NAME + "，外部类的name = " + A.this.NAME);
            }
        }

        B b = new B();
        b.show();
    }
}
