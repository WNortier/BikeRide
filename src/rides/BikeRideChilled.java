package rides;

import specification.Bicycle;

public class BikeRideChilled implements BikeRide {
    public void ride(Bicycle bike){
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}
