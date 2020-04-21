package bicycles;

public class BicycleFromSpec extends BicycleBase {
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleFromSpec(BicycleSpecification bike) {
        this.accelerationSpeed = bike.getAccelerationSpeed();
        this.brakeSpeed = bike.getBrakeSpeed();
    }

    public void accelerate() {
        changeSpeed(this.accelerationSpeed);
    }

    public void brake() {
        changeSpeed(this.brakeSpeed);
    }
}