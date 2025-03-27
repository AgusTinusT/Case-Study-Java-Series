package me.agus.casestudy05;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + ", Type: Motorcycle, Has Sidecar: " + hasSideCar;
    }
}
