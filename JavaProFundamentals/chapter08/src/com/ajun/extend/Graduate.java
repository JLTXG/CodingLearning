package com.ajun.extend;

public class Graduate extends Student{
    public Graduate(String name, int age, double score) {
        super(name, age, score);
    }

    public void study(){
        System.out.println("研究生每天学习8小时");
    }
}
