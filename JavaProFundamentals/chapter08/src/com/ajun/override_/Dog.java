package com.ajun.override_;

public class Dog extends Animal {
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }

    public String m1() {
        return null;
    }

//    public Object m2() {
//        return null;
//    }

    public AAA m3() {
        return null;
    }

//    protected void eat() {
//
//    }
    //  细节: 子类方法不能缩小父类方法的访问权限 【演示】
    //  public > protected > 默认>private
    public void eat() {

    }

}

class AAA {

}

class BBB extends AAA  {

}

