package com.ajun.extend;

public class ExtendDetail extends Base {
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
