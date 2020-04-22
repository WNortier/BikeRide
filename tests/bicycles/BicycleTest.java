package bicycles;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BicycleTest {

    @Test
    public void shouldTakeRoadBikeOnARide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(roadBike);
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void shouldTakeMountainBikeOnARide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(mountainBike);
        assertEquals(2, mountainBike.currentSpeed());
    }

    @Test
    public void shouldTakeTandemOnARide() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideWild = new BikeRideWild();
        bikeRideWild.ride(tandemBike);
        assertEquals(53, tandemBike.currentSpeed());
    }

    @Test public void shouldAcceptABikeToFunRide(){
        FunRide funride = new FunRide(5);
        assertEquals("Bike Accepted", funride.addBikeToRide(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.addBikeToRide(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.addBikeToRide(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.addBikeToRide(BicycleType.MountainBike));
        assertEquals("Bike Accepted", funride.addBikeToRide(BicycleType.TandemBike));
        assertEquals(5, funride.getEnteredCount());
        assertEquals(3, funride.getCountForType(BicycleType.RoadBike));
        assertEquals("Bike Rejected", funride.addBikeToRide(BicycleType.MountainBike));
    }
}
