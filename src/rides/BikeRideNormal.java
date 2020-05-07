package rides;

import interfaces.BikeRide;
import interfaces.Bicycle;

public class BikeRideNormal implements BikeRide {

    Bicycle bike;

    public BikeRideNormal(Bicycle bike){
        this.bike = bike;
    }

    public void ride() {
        this.bike.accelerate();
        this.bike.accelerate();
        this.bike.brake();
        System.out.println(bike.currentSpeed());
    }
}