package me.agus.casestudy05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class PolymorphismTest {

    @Test
    void testVehicleList() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", "Avanza", 2020, 60));
        vehicles.add(new Motorcycle("Honda", "Beat", 2021, false));
        vehicles.add(new Car("Daihatsu", "Xenia", 2019, 40));
        vehicles.add(new Motorcycle("Yamaha", "NMAX", 2022, true));

        // Iterasi dan cetak informasi kendaraan
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleInfo());
            assertTrue(vehicle.getVehicleInfo().contains(vehicle.getBrand()));
            assertTrue(vehicle.getVehicleInfo().contains(vehicle.getModel()));
            assertTrue(vehicle.getVehicleInfo().contains(String.valueOf(vehicle.getYear())));
        }
    }

    @Test
    void testDowncast() {
        List<Vehicle> vehicles = new ArrayList<>();
        Car myCar = new Car("Toyota", "Avanza", 2020, 60);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "Beat", 2021, false);
        vehicles.add(myCar);
        vehicles.add(myMotorcycle);

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car car) {
                car.accelerate(10);
                assertTrue(car.getSpeed() > 60);
            } else if (vehicle instanceof Motorcycle motorcycle) {
                assertFalse(motorcycle.hasSideCar());
            }
        }
    }
}