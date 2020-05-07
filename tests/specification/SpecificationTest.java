package specification;

import interfaces.Bicycle;
import models.BicycleType;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpecificationTest {

    @Test
    public void should_Create_Road_Bike_From_Spec() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        assertEquals(BicycleType.RoadBike, roadBikeSpec.getBicycleType());
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        roadBike.accelerate();
        assertEquals(11, roadBike.currentSpeed());
        roadBike.accelerate();
        assertEquals(22, roadBike.currentSpeed());
        roadBike.brake();
        assertEquals(18, roadBike.currentSpeed());
        roadBike.stop();
        assertEquals(0, roadBike.currentSpeed());
    }

    @Test
    public void should_Create_Mountain_Bike_From_Spec() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        assertEquals(BicycleType.MountainBike, mountainBikeSpec.getBicycleType());
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        mountainBike.accelerate();
        assertEquals(5, mountainBike.currentSpeed());
        mountainBike.accelerate();
        assertEquals(10, mountainBike.currentSpeed());
        mountainBike.brake();
        assertEquals(7, mountainBike.currentSpeed());
        mountainBike.stop();
        assertEquals(0, mountainBike.currentSpeed());
    }

    @Test
    public void should_Create_Tandem_Bike_From_Spec() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        assertEquals(BicycleType.TandemBike, tandemBikeSpec.getBicycleType());
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        tandemBike.accelerate();
        assertEquals(12, tandemBike.currentSpeed());
        tandemBike.accelerate();
        assertEquals(24, tandemBike.currentSpeed());
        tandemBike.brake();
        assertEquals(17, tandemBike.currentSpeed());
        tandemBike.stop();
        assertEquals(0, tandemBike.currentSpeed());
    }
}
