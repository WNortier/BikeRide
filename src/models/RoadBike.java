package models;

import bicycles.Bicycle;
import bicycles.BicycleBase;

public class RoadBike extends BicycleBase implements Bicycle {
    public void accelerate() {
        changeSpeed(11);
    }
    public void brake() {
        changeSpeed(-4);
    }
}
