package models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class RoadBike extends BicycleBase {

//    private int speed = 0;

    public void accelerate() {
        changeSpeed(11);
//        this.speed += 11;
    }

    public void brake() {
        changeSpeed(-4);
//        this.speed -= 4;
    }

//    public int currentSpeed() {
//        return this.speed;
//    }
//
//    public void stop() {
//        this.speed = 0;
//    }
}
