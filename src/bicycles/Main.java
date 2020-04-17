package bicycles;

import models.MountainBike;
import models.RoadBike;

public class Main {
    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRide(bicycle);
        bikeRide.ride();
    }
}

interface BikeRide {

}

class BikeRideOne implements BikeRide {
    public void ride(Bicycle bike) {
        bike.accelerate();
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}

class BikeRideChilled implements BikeRide {
    public void chilledRide(Bicycle bike){
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}

class BikeRideWild implements BikeRide {
    public void wildRide(Bicycle bike){
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}