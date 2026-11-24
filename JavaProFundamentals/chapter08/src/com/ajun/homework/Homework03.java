package com.ajun.homework;

public class Homework03 {
    public static void main(String[] args) {
        Teacher Tom = new Professor("Tom", 42, "教授", 10947.43);
        Tom.introduce();
        Teacher Marry = new FuProfessor("Marry", 38, "副教授", 8903.897);
        Marry.introduce();
        Teacher Jack = new Jianshi("Jack", 33, "讲师", 7906.33);
        Jack.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("教师信息：");
        System.out.println("姓名：" + this.getName() + "，" + "年龄：" +
                this.getAge() + "，" + "职称：" + this.getPost() + "基本工资：" + this.getSalary());
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("教师信息：");
        System.out.println("姓名：" + this.getName() + "，" + "年龄：" +
                this.getAge() + "，" + "职称：" + this.getPost() + "基本工资：" + this.getSalary() * 1.3);
    }
}

class FuProfessor extends Teacher {
    public FuProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("教师信息：");
        System.out.println("姓名：" + this.getName() + "，" + "年龄：" +
                this.getAge() + "，" + "职称：" + this.getPost() + "基本工资：" + this.getSalary() * 1.2);
    }
}

class Jianshi extends Teacher {
    public Jianshi(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("教师信息：");
        System.out.println("姓名：" + this.getName() + "，" + "年龄：" +
                this.getAge() + "，" + "职称：" + this.getPost() + "基本工资：" + this.getSalary() * 1.1);
    }
}
