package org.example.lesson2.DZ2.Stuff;

import java.util.ArrayList;
import java.util.List;

public class Motorcycle extends Vehicle {
    @Override
    int vehicleAssembly() {
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel());
        wheels.add(new Wheel());
        int quantityWheels = wheels.size();
        return quantityWheels;
    }

    @Override
    void park() {
        speed = 0;
    }

    @Override
    int testDrive() {
        speed = 75;
        return speed;
    }
}
