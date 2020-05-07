package specification;

import interfaces.Bicycle;
import models.BicycleType;

public class BicycleFromSpec extends BicycleBase {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycle;


    public BicycleFromSpec(BicycleSpecification bike) {
        this.accelerationSpeed = bike.getAccelerationSpeed();
        this.brakeSpeed = bike.getBrakeSpeed();
        this.bicycle = bike.getBicycleType();

    }

    public void accelerate() {
        changeSpeed(this.accelerationSpeed);
    }

    public void brake() {
        changeSpeed(this.brakeSpeed);
    }

    public BicycleType getBikeType() {
        return this.bicycle;
    }

}