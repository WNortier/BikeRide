package rides;

import interfaces.BikeRide;
import interfaces.Bicycle;

public class BikeRideWild implements BikeRide {

    Bicycle bike;

    public BikeRideWild(Bicycle bike){
        this.bike = bike;
    }

    public void ride(){
        this.bike.accelerate();
        this.bike.accelerate();
        this.bike.accelerate();
        this.bike.accelerate();
        this.bike.accelerate();
        this.bike.brake();
        System.out.println(bike.currentSpeed());
    }
}
