package com.ajun.override_;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);//这里会调用父类构造器
        this.id = id;
        this.score = score;
    }
    //say
    public String say() { //这里体现super的一个好处，代码复用.
        return super.say() + " id=" + id + " score=" + score;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
