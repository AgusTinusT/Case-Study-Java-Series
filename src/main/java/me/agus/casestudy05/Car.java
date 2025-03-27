package me.agus.casestudy05;

public class Car extends Vehicle {
    private int speed = 0;

    Car(String brand, String model, int year, int speed){
        super(brand, model, year);
        this.speed = speed;
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
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public String getCarInfo(){
        return super.getVehicleInfo() + ", Speed: " + speed + " km/h";
    }
}
