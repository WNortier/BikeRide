package bicycles;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BicycleTest {

    @Test
    public void shouldTakeRoadBikeOnARide() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne();
        BikeRideChilled bikeRideChilled = new BikeRideChilled();

        bikeRideOne.ride(roadBike);
        assertEquals(18, roadBike.currentSpeed());

        bikeRideChilled.chilledRide(roadBike);
        assertEquals(25, roadBike.currentSpeed());
    }

    @Test
    public void shouldTakeMountainBikeOnARide() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(mountainBike);
        assertEquals(7, mountainBike.currentSpeed());
    }

    @Test
    public void shouldTakeTandemOnARide() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(tandem);
        assertEquals(17, tandem.currentSpeed());
    }
}
