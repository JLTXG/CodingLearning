package com.ajun.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person Jack = new Person("Jack", 10);
        System.out.println(Jack.say());

        Student Smith = new Student("Smith", 20, 123456, 99.8);
        System.out.println(Smith.say());
    }
}
