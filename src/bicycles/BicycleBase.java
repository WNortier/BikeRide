package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int speedAmount){
        this.speed += speedAmount;
    };

    public void stop(){
        this.speed = 0;
    }

    public int currentSpeed() {
      return this.speed;
    }
}

class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed) {
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
}

class BicycleFromSpec extends BicycleBase {
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleFromSpec(BicycleSpecification bike){
        this.accelerationSpeed = bike.getAccelerationSpeed();
        this.brakeSpeed = bike.getBrakeSpeed();
    }

    public void accelerate(){
        changeSpeed(this.accelerationSpeed);
    }

    public void brake(){
        changeSpeed(this.brakeSpeed);
    }
}