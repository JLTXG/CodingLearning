package com.ajun.interface_;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface A11 {  // 1min 看看
    int x = 0;
}  //想到 等价 public static final int x = 0;

class B1 {
    int x = 1;
} //普通属性

class C1 extends B1 implements A11 {
    public void pX() {
        //System.out.println(x); //错误，原因不明确x
        //可以明确的指定x
        //访问接口的 x 就使用 A11.x
        //访问父类的 x 就使用 super.x
        System.out.println(A11.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C1().pX();
    }
}
