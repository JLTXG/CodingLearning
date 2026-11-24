package com.ajun.homework;

import com.ajun.poly_.Master;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("Tom", 100, 30, 100);
        manager.setBonus(3000);
        manager.printSal();

        Worker worker = new Worker("Jack", 50, 40, 50);
        worker.printSal();
    }
}
