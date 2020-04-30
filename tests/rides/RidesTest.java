package rides;

import models.BicycleType;
import org.junit.Test;
import specification.Bicycle;
import specification.BicycleFromSpec;
import specification.BicycleSpecification;

import static junit.framework.TestCase.assertEquals;

public class RidesTest {

    //RoadBike Rides

    @Test
    public void ShouldGoOnA_Normal_RoadBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(roadBike);
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Chilled_RoadBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(roadBike);
        assertEquals(7, roadBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Wild_RoadBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(roadBike);
        assertEquals(51, roadBike.currentSpeed());
    }

    //MountainBike Rides

    @Test
    public void ShouldGoOnA_Normal_MountainBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(roadBike);
        assertEquals(7, roadBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Chilled_MountainBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(mountainBike);
        assertEquals(2, mountainBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Wild_MountainBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(roadBike);
        assertEquals(22, roadBike.currentSpeed());
    }

    //TandemBike Rides

    @Test
    public void ShouldGoOnA_Normal_TandemBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(tandemBike);
        assertEquals(17, tandemBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Chilled_TandemBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(tandemBike);
        assertEquals(5, tandemBike.currentSpeed());
    }

    @Test
    public void ShouldGoOnA_Wild_TandemBikeRide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(tandemBike);
        assertEquals(53, tandemBike.currentSpeed());
    }

    @Test
    public void shouldAcceptABikeToFunRide() {
        FunRide funride = new FunRide(5);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
//        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
//        assertEquals("Bike Accepted", funride.accept(BicycleType.TandemBike));
//        assertEquals(5, funride.getEnteredCount());
//        assertEquals(3, funride.getCountForType(BicycleType.RoadBike));
//        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
//        assertEquals("Bike Rejected", funride.accept(BicycleType.MountainBike));
    }
}
