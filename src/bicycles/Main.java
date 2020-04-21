package bicycles;

public class Main {
    public static void main(String[] args) {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);

        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);

        BikeRide bikeRideOne = new BikeRideOne();
        BikeRide bikeRideChilled = new BikeRideChilled();
        BikeRide bikeRideWild = new BikeRideWild();

        bikeRideOne.ride(roadBike);
        bikeRideChilled.ride(mountainBike);
        bikeRideWild.ride(tandemBike);
    }
}

interface BikeRide {
    void ride(Bicycle bike);
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
    public void ride(Bicycle bike){
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}

class BikeRideWild implements BikeRide {
    public void ride(Bicycle bike){
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.brake();
        System.out.println(bike.currentSpeed());
    }
}