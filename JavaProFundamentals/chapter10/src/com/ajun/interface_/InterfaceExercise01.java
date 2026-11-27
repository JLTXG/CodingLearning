package com.ajun.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();//ok
        System.out.println(b.a);  //23
        System.out.println(A1.a);  //23
        System.out.println(B.a);  //23
    }
}

interface A1 {
    int a = 23; //等价 public static final int a = 23;
}

class B implements A1 {//正确
}
