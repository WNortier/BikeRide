package bicycles;

import models.MountainBike;
import models.RoadBike;

public class Main {
    public static void main(String[] args) {
        RoadBike roadbike = new RoadBike();
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRide = new BikeRideOne();
//        bikeRide.ride(roadbike);
//        bikeRide.ride(mountainBike);


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