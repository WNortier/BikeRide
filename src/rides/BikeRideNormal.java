package rides;

import specification.Bicycle;

public class BikeRideNormal implements BikeRide {
    public void ride(Bicycle bike) {
        bike.accelerate();
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}