package org.example.lesson2.DZ2.Stuff;

public abstract class Vehicle {
    int speed = 0;

    abstract int vehicleAssembly();

    abstract void park();

    abstract int testDrive();
    int parkingMode() {
        testDrive();
        park();
        return speed;
    }

    static class Wheel {
    }
}
