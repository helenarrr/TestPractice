package org.example.lesson2.DZ2.Stuff;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    @Override
    public int testDrive() {
        speed = 60;
        return speed;
    }

    @Override
    public int vehicleAssembly() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        int quantityWheels = wheels.size();
        return quantityWheels;
    }

    @Override
    void park() {
        speed = 0;
    }




}
