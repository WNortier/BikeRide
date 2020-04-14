package models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class MountainBike extends BicycleBase {

//    private int speed = 0;

    public void accelerate() {
        changeSpeed(5);
//        this.speed += 5;
    }

    public void brake() {
        changeSpeed(-3);
//        this.speed -= 3;
    }

//    public int currentSpeed() {
//        return this.speed;
//    }
//
//    public void stop() {
//        this.speed = 0;
//    }
}
