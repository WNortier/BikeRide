package models;

import bicycles.BicycleBase;

public class Tandem extends BicycleBase {
    public void accelerate() {
        changeSpeed(12);
//        this.speed += 5;
    }

    public void brake() {
        changeSpeed(-7);
//        this.speed -= 3;
    }
}
