package com.ajun.enum_;

public class Enumeration01 {
    public static void main(String[] args) {

    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String race) {
        this.name = name;
        this.desc = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
