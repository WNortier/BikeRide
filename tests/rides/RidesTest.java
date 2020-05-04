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
    public void should_Go_On_A_Normal_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(roadBike);
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(roadBike);
        assertEquals(7, roadBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Wild_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(roadBike);
        assertEquals(51, roadBike.currentSpeed());
    }

    //MountainBike Rides

    @Test
    public void should_Go_On_A_Normal_MountainBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(roadBike);
        assertEquals(7, roadBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_MountainBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(mountainBike);
        assertEquals(2, mountainBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Wild_MountainBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(roadBike);
        assertEquals(22, roadBike.currentSpeed());
    }

    //TandemBike Rides

    @Test
    public void should_Go_On_A_Normal_TandemBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal();
        bikeRideNormal.ride(tandemBike);
        assertEquals(17, tandemBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_TandemBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled();
        bikeRideChilled.ride(tandemBike);
        assertEquals(5, tandemBike.currentSpeed());
    }

    @Test
    public void Should_Go_On_A_Wild_TandemBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.MountainBike);
        Bicycle tandemBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild();
        BikeRideWild.ride(tandemBike);
        assertEquals(53, tandemBike.currentSpeed());
    }

    //Fun ride

    @Test
    public void should_Accept_A_Bike_ToFunRide() {
        FunRide funride = new FunRide(3);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.TandemBike));
    }

    //No Duplicates

    @Test
    public void should_Prevent_Duplicate_Bikes_To_FunRide() {
        FunRide funride = new FunRide(3);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.TandemBike));
        assertEquals("Error - Ride Full", funride.accept(BicycleType.TandemBike));

    }

    //Max Entries

    @Test
    public void should_Prevent_FunRide_From_Exceeding_Max_Entries() {
        FunRide funride = new FunRide(3);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.TandemBike));
        assertEquals("Error - Ride Full", funride.accept(BicycleType.MountainBike));
        assertEquals("Error - Ride Full", funride.accept(BicycleType.TandemBike));
    }

    //Count

    @Test
    public void should_Return_Count_For_BikeType() {
        FunRide funride = new FunRide(3);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.TandemBike));
        assertEquals("Error - Ride Full", funride.accept(BicycleType.MountainBike));
        assertEquals("Error - Ride Full", funride.accept(BicycleType.TandemBike));

        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
    }

    @Test
    public void should_Return_Count_For_Bicycles_Entered() {
        FunRide funride = new FunRide(3);
        assertEquals("Bike Accepted", funride.accept(BicycleType.RoadBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));
        assertEquals("Bike Accepted", funride.accept(BicycleType.MountainBike));
        assertEquals("Error - Duplicate Bike", funride.accept(BicycleType.RoadBike));

        assertEquals(2, funride.getEnteredCount());
    }
}
