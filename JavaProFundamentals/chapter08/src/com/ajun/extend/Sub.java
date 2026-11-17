package com.ajun.extend;

public class Sub extends Base {
    public Sub() {
        super("name");  // 默认调用父类的无参构造器
        System.out.println("Sub()构造器被调用");
    }

    public Sub(String name) {
        super("name");  // 默认调用父类的无参构造器
        System.out.println("Sub(name)构造器被调用");
    }

    public void sayOK() {
        getN1();
        getN2();
        getN3();
//        getN4();
    }

    @Override
    int getN3() {
        return super.getN3();
    }
}
