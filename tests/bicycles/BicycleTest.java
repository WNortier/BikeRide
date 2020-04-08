package bicycles;

import models.MountainBike;
import models.RoadBike;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BicycleTest {

    @Test
    public void shouldTakeRoadBikeOnARide() {
        RoadBike roadBike = new RoadBike();
        BikeRide bikeRide = new BikeRide();
        bikeRide.ride(roadBike);
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void shouldTakeMountainBikeOnARide() {
        MountainBike mountainBike = new MountainBike();
        BikeRide bikeRide = new BikeRide();
        bikeRide.ride(mountainBike);
        assertEquals(7, mountainBike.currentSpeed());
    }

}
