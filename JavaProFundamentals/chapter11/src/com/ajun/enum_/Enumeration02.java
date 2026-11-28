package com.ajun.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
        System.out.println(Season1.SUMMER);
    }
}

class Season1 {
    private String name;
    private String desc;

    //定义了四个对象, 固定.
    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season WINTER = new Season("冬天", "寒冷");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season SUMMER = new Season("夏天", "炎热");

    private Season1(String name, String race) {
        this.name = name;
        this.desc = race;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getDesc() {
        return desc;
    }

//    public void setDesc(String desc) {
//        this.desc = desc;
//    }


    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
