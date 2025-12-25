/**
 * @author AJun
 * @createDate 2025/12/25 22:40
 * @description:
 */
public class PropertiesDetail {

    public static void main(String[] args){
        //  创建Person对象
        //  person 是对象名(对象引用)
        //  new Person() 创建的对象空间（数据）才是真正的对象
        Person person = new Person();

        //  对象的属性默认值，遵守数组的规则
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.sex);
        System.out.println(person.salary);
    }

}

class Person {
    String name;
    int age;
    double salary;
    boolean sex;
}
