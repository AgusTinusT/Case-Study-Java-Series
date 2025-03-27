package me.agus.casestudy03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCarCreation() {
        Car myCar = new Car("Toyota", "Avanza", 2020, 0);
        assertEquals("Toyota", myCar.getBrand());
        assertEquals("Avanza", myCar.getModel());
        assertEquals(2020, myCar.getYear());
        assertEquals(0, myCar.getSpeed());
    }

    @Test
    void testAccelerate() {
        Car myCar = new Car("Honda", "Civic", 2022, 50);
        myCar.accelerate(20);
        assertEquals(70, myCar.getSpeed());
        myCar.accelerate(-10); // Increment negatif seharusnya tidak mengubah kecepatan
        assertEquals(70, myCar.getSpeed());
    }

    @Test
    void testBrake() {
        Car myCar = new Car("Daihatsu", "Xenia", 2019, 60);
        myCar.brake(30);
        assertEquals(30, myCar.getSpeed());
        myCar.brake(50); // Mengurangi lebih banyak dari kecepatan saat ini
        assertEquals(0, myCar.getSpeed());
    }

    @Test
    void testGetCarInfo() {
        Car myCar = new Car("Suzuki", "Ertiga", 2021, 40);
        String expectedInfo = "Brand: Suzuki, Model: Ertiga, Year: 2021, Speed: 40 km/h"; // Sesuaikan format sesuai implementasi Anda
        assertEquals(expectedInfo, myCar.getCarInfo());
    }
}