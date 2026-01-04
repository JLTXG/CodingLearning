/**
 * @author AJun
 * @createDate 2026/1/4 18:26
 * @description:
 */
public class Method01 {
    public static void main(String[] args) {
        // 方法使用
        // 1.方法写好后，如果不去调用，不会输出
        // 2.先创建对象，然后调用方法即可
        personNew person = new personNew();
        person.speak();
        person.cal01();
        person.cal02(1000);
        person.cal02(2000);

        int resultSum = person.getSum(1000000, 10);
        System.out.println("resultSum = " + resultSum);
    }
}

class personNew{
    String name;
    int age;

    public void speak(){
        System.out.println("我是一个好人");
    }

    // 添加cal01成员方法，可以计算从 1+...+100 的结果
    public void cal01(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("cal01 计算结果 = " + sum);
    }

    // 添加cal02成员方法，该方法可以接收一个数n，可以计算从 1+...+n 的结果
    public void cal02(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("cal02 计算结果 = " + sum);
    }

    // 添加getSum成员方法，可以计算两个数的和
    public int getSum(int a, int b){
        return a + b;
    }

}
