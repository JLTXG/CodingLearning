package com.ajun.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main outer05 hashcode=" + outer05);
    }
}

class Outer05 {
    private int n1 = 1111111;
    public void f1() {
        Person person = new Person(){
            private int n1 = 888888;
            @Override
            public void hi() {
                System.out.println("重写hi n1 = " + n1 + " 外部类的n1 = " + Outer05.this.n1);
                System.out.println("Outer05.this hashcode=" + Outer05.this);
            }
        };
        person.hi();

        new Person(){
            @Override
            public void hi() {
                System.out.println("再次重写hi");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("JACK");
    }
}

class Person {
    public void hi() {
        System.out.println("Say Hi! Hello!");
    }
    public void ok(String str) {
        System.out.println("Say OK " + str);
    }
}
