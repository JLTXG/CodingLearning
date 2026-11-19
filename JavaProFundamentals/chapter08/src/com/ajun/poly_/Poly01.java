package com.ajun.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master Tom = new Master("Tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        Tom.feed(dog, bone);
    }
}
