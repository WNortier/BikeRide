package models;

import specification.BicycleBase;

public class RoadBike extends BicycleBase {
    public void accelerate() {
        changeSpeed(11);
        System.out.println("RoadBike Accelerates");
    }

    public void brake() {
        changeSpeed(-4);
        System.out.println("RoadBike Brakes");
    }
}
