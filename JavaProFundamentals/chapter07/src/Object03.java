/**
 * @author AJun
 * @createDate 2026/1/3 22:13
 * @description:
 */
public class Object03 {

    public static void main(String[] args) {
        newPerson a = new newPerson();
        a.age = 10;
        a.name = "小王";
        newPerson b;
        b = a;
        System.out.println(b.name);
        b.age = 20;
        b = null;
        System.out.println(a.age);
        System.out.println(b.age);
    }
}

class newPerson {
    String name;
    int age;
}
