package models;

import org.junit.Test;

import specification.Bicycle;
import specification.BicycleFromSpec;
import specification.BicycleSpecification;

import static junit.framework.TestCase.assertEquals;

public class ModelsTest {

    @Test
    public void shouldInstantiateRoadBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        roadBike.accelerate();
        assertEquals(11, roadBike.currentSpeed());
        roadBike.brake();
        assertEquals(7, roadBike.currentSpeed());
        roadBike.accelerate();
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void shouldInstantiateMountainBike() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(roadBikeSpec);
        mountainBike.accelerate();
        assertEquals(5, mountainBike.currentSpeed());
        mountainBike.brake();
        assertEquals(2, mountainBike.currentSpeed());
        mountainBike.accelerate();
        assertEquals(7, mountainBike.currentSpeed());
    }

    @Test
    public void getShouldInstantiateTandemBike() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        tandemBike.accelerate();
        assertEquals(12, tandemBike.currentSpeed());
        tandemBike.brake();
        assertEquals(5, tandemBike.currentSpeed());
        tandemBike.accelerate();
        assertEquals(17, tandemBike.currentSpeed());
    }

}
