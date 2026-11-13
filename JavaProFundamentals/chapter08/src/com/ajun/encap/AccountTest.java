package com.ajun.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account person = new Account("李斯", 200, "123000");
        System.out.println("个人信息：" + person.getName() + "   " + person.getYue() + "   " + person.getPwd());
    }
}
