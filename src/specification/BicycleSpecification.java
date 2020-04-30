package specification;

import models.BicycleType;

public class BicycleSpecification {

    private int accelerationSpeed;
    private int brakeSpeed;
    private final BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycletype) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycletype;
    }
    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return this.brakeSpeed;
    }
}