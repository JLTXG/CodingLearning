package com.ajun.extend.exercise;

public class PC extends Computer {

    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息=");
//        System.out.println(getCpu() + getMemory() + getDisk());
        //调用父类的getDetails方法，得到相关属性信息..
        System.out.println(getDetails() + " brand=" + brand);
    }
}
