package com.ajun.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey littleMonkey = new LittleMonkey("悟空");
        littleMonkey.climbing();
        littleMonkey.flying();
        littleMonkey.swimming();
    }
}

//接口
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println( this.name + "会爬树......");
    }

    public String getName() {
        return name;
    }
}

class LittleMonkey extends Monkey implements Fishable, Birdable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void flying() {
        System.out.println(getName() + "会飞翔");
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "会游泳");
    }
}
