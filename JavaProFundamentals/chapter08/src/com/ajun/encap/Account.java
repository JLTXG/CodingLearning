package com.ajun.encap;

public class Account {
    private String name;
    private int yue;
    private String pwd;

    public Account(String name, int yue, String pwd) {
        this.setName(name);
        this.setYue(yue);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("用户名长度不符合要求，设置为默认值“张三”！");
            this.name = "张三";
        }
    }

    public int getYue() {
        return yue;
    }

    public void setYue(int yue) {
        if (yue > 20) {
            this.yue = yue;
        } else {
            System.out.println("余额不能小于20，设置为默认值20！");
            this.yue = 20;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码长度必须为6位，设置为默认值“000000”！");
            this.pwd = "000000";
        }
    }
//
//    public void showInfo() {
//        this.getName();
//        this.getYue();
//        this.getPwd();
//    }
}
