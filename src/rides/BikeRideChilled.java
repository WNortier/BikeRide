package rides;

import interfaces.BikeRide;
import interfaces.Bicycle;

public class BikeRideChilled implements BikeRide {

    Bicycle bike;

    public BikeRideChilled(Bicycle bike){
        this.bike = bike;
    }

    public void ride(){
        this.bike.accelerate();
        this.bike.brake();
        System.out.println(bike.currentSpeed());
    }
}
