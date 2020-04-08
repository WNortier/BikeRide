package bicycles;

import models.MountainBike;
import models.RoadBike;

public class Main {
    public static void main(String[] args) {
        RoadBike roadbike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide();
        bikeRide.ride(roadbike);
        bikeRide.ride(mountainBike);

    }
}

class BikeRide {

    public void ride(Bicycle bike) {
        bike.accelerate();
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }

}