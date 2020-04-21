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





