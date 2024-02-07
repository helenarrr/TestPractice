package org.example.calc.lesson2.DZ2.Stuff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

//    Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void vehicleAssembly() {
        assertEquals(2, new Motorcycle().vehicleAssembly());
    }

//    Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void testDrive() {
        assertEquals(75, new Motorcycle().testDrive());
    }

//    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

    @Test
    void parkingMode() {
        Motorcycle motorcycle = new Motorcycle();
        int resultSpeed = motorcycle.parkingMode();
        assertEquals(0, resultSpeed);
    }
}