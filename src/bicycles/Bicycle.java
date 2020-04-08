package bicycles;

//public class Bicycle {
//
//    private int speed = 0;
//
//    public void accelerate() {
//        this.speed += 5;
//    }
//
//    public void brake() {
//        this.speed -= 3;
//    }
//
//    public int currentSpeed() {
//        return this.speed;
//    }
//
//    public void stop() {
//        this.speed = 0;
//    }
//};

import models.MountainBike;
import models.RoadBike;



public interface Bicycle {
    void accelerate();
    void brake();
    int currentSpeed();
    void stop();
}