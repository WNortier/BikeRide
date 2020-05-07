package specification;

import interfaces.Bicycle;
import models.BicycleType;
import interfaces.BikeRide;
import rides.BikeRideChilled;
import rides.BikeRideNormal;
import rides.BikeRideWild;

public class Main {
    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideOne = new BikeRideNormal(roadBike);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled(mountainBike);


        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideWild = new BikeRideWild(tandemBike);

        bikeRideOne.ride();
        bikeRideChilled.ride();
        bikeRideWild.ride();
    }
}


