package com.ajun.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu Tom = new Stu("Tom");
        Tom.payFee(100);
        Stu.payFee(300);

        Stu Marry = new Stu("Marry");
        Marry.payFee(300);
        Stu.payFee(300);

        Stu.showFee();
    }
}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //说明
    //1. 当方法使用了static修饰后，该方法就是静态方法
    //2. 静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("总学费有：" + Stu.fee);
    }
}
