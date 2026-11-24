package com.ajun.homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker Tom = new Worker("Tom", 10000.11);
        Tom.printSal();
        Peasant Jack = new Peasant("Jack", 10000.11);
        Jack.printSal();
        Waiter Marry = new Waiter("Marry", 9999.9);
        Marry.printSal();
        Teacher Bob = new Teacher("Bob", 10111.11);
        Bob.setDay(100);
        Bob.setDaySalary(20);
        Bob.printSal();
        Scientist Smith = new Scientist("Smith", 19000.11);
        Smith.setYearEndBonus(10000);
        Smith.printSal();
    }
}
