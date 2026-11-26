package com.ajun.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = GirlFriend.getInstance();
        System.out.println(girlFriend1.toString());;

        GirlFriend girlFriend2 = GirlFriend.getInstance();
        System.out.println(girlFriend2.toString());

        System.out.println(girlFriend1 == girlFriend2);
    }
}

class GirlFriend {
    private String name;

    private static GirlFriend girlFriend = new GirlFriend("红红");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
