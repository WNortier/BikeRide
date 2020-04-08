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