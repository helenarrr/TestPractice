package org.example.calc.lesson2.DZ2.Stuff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    //    Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void testVehicle() {
        Car car = new Car();
        assertTrue(car instanceof Vehicle);
    }

//    Проверить, что объект Car создается с 4-мя колесами.

    @Test
    void vehicleAssembly() {
        assertEquals(4, new Car().vehicleAssembly());
    }

//    - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void testDrive() {
        assertEquals(60, new Car().testDrive());
    }

//    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

    @Test
    void parkingMode() {
        Car car = new Car();
        int resultSpeed = car.parkingMode();
        assertEquals(0, resultSpeed);
    }

}