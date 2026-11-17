package com.ajun.extend;

public class TestExtend {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("哈哈哈", 9, 123);
        pupil.testing();
        pupil.showInfo();
        System.out.println("---------------------------------------");
        Graduate graduate = new Graduate("嘻嘻嘻", 22, 1000000000);
        graduate.study();
        graduate.showInfo();
    }
}
