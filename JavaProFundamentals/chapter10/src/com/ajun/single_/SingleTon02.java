package com.ajun.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);

        Cat cat2 = Cat.getInstance();
        System.out.println(cat2);

        System.out.println(cat1 == cat2);
    }
}

class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat = new Cat("肥波");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
