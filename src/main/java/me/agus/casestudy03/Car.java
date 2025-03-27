package me.agus.casestudy03;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private int speed = 0;

    Car(String brand, String model, int year, int speed){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public int getSpeed(){
        return speed;
    }

    public void accelerate(int speed){
        if (speed < 0){
            return;
        }
        this.speed += speed;
    }

    public void brake(int speed){
        if (speed < 0) {
            return;
        } else if (speed > this.speed) {
            this.speed = 0;
        }

        this.speed -= speed;

    }

    public String getCarInfo(){
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Speed: " + speed + " km/h";
    }
}
