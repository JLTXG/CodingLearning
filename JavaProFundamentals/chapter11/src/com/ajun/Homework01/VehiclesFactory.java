package com.ajun.Homework01;

public class VehiclesFactory {
    private static Horse horse = new Horse();
    private static Boat boat = new Boat();
    private static Plane plane = new Plane();

    private VehiclesFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return boat;
    }

    public static Plane getPlane() {
        return plane;
    }
}
