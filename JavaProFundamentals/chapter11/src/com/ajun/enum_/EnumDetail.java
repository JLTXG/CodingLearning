package com.ajun.enum_;

public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}

class A {

}

interface IPlaying {
    public void playing();
}

enum Music implements IPlaying {
    CLASSICMUSIC;

    @Override
    public void playing() {
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }
}
