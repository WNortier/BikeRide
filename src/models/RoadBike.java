package models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {

    private int speed = 0;

    public void accelerate() {
        this.speed += 11;
    }

    public void brake() {
        this.speed -= 4;
    }

    public int currentSpeed() {
        return this.speed;
    }

    public void stop() {
        this.speed = 0;
    }
}
