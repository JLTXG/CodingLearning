/**
 * @author AJun
 * @createDate 2025/12/24 21:22
 * @description:
 */
public class Object01 {

    public static void main(String[] arghs) {

        String cat1Name = "小白";
        int cat1Age = 1;
        String cat1Color = "白色";

        String cat2Name = "小黑";
        int cat2Age = 2;
        String cat2Color = "黑色";

        String[] cat1 = {"小白", "3", "白色"};
        String[] cat2 = {"小黑", "4", "黑色"};

        //  使用OOP面向对象解决
        Cat catOne = new Cat();
        catOne.name = "小白";
        catOne.age = 3;
        catOne.color = "白色";
        catOne.weight = 5.5;

        Cat catTwo = new Cat();
        catTwo.name = "小黑";
        catTwo.age = 4;
        catTwo.color = "黑色";
        catTwo.weight = 4.5;

        System.out.println("第1只猫信息" + catOne.name + " " + catOne.age + " " + catOne.color + " " + catOne.weight);
        System.out.println("第2只猫信息" + catTwo.name + " " + catTwo.age + " " + catTwo.color + " " + catTwo.weight);

    }

}

class Cat {
    //  属性
    String name;
    int age;
    String color;

    double weight;
}
