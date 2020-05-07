package rides;

import interfaces.BikeRide;
import models.BicycleType;
import org.junit.Test;
import interfaces.Bicycle;
import specification.BicycleFromSpec;
import specification.BicycleSpecification;

import static junit.framework.TestCase.assertEquals;

public class RidesTest {

    //RoadBike Rides

    @Test
    public void should_Go_On_A_Normal_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal(roadBike);
        bikeRideNormal.ride();
        assertEquals(18, roadBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled(roadBike);
        bikeRideChilled.ride();
        assertEquals(7, roadBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Wild_RoadBike_BikeRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild(roadBike);
        BikeRideWild.ride();
        assertEquals(51, roadBike.currentSpeed());
    }

    //MountainBike Rides

    @Test
    public void should_Go_On_A_Normal_MountainBike_BikeRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal(mountainBike);
        bikeRideNormal.ride();
        assertEquals(7, mountainBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_MountainBike_BikeRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled(mountainBike);
        bikeRideChilled.ride();
        assertEquals(2, mountainBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Wild_MountainBike_BikeRide() {
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild(roadBike);
        BikeRideWild.ride();
        assertEquals(22, roadBike.currentSpeed());
    }

    //TandemBike Rides

    @Test
    public void should_Go_On_A_Normal_TandemBike_BikeRide() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideNormal = new BikeRideNormal(tandemBike);
        bikeRideNormal.ride();
        assertEquals(17, tandemBike.currentSpeed());
    }

    @Test
    public void should_Go_On_A_Chilled_TandemBike_BikeRide() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide bikeRideChilled = new BikeRideChilled(tandemBike);
        bikeRideChilled.ride();
        assertEquals(5, tandemBike.currentSpeed());
    }

    @Test
    public void Should_Go_On_A_Wild_TandemBike_BikeRide() {
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.TandemBike);
        Bicycle tandemBike = new BicycleFromSpec(tandemBikeSpec);
        BikeRide BikeRideWild = new BikeRideWild(tandemBike);
        BikeRideWild.ride();
        assertEquals(53, tandemBike.currentSpeed());
    }

    //Fun ride

    @Test
    public void should_Accept_A_Bike_ToFunRide() {
        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getEnteredCount());
        funride.accept(BicycleType.MountainBike);
        assertEquals(2, funride.getEnteredCount());
        funride.accept(BicycleType.TandemBike);
        assertEquals(3, funride.getEnteredCount());
    }

    //No Duplicates

    @Test
    public void should_Prevent_Duplicate_Bikes_To_FunRide() {
        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));

        funride.accept(BicycleType.MountainBike);
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));
        funride.accept(BicycleType.MountainBike);
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));

        funride.accept(BicycleType.TandemBike);
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
        funride.accept(BicycleType.TandemBike);
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
    }

    //Max Entries

    @Test
    public void should_Prevent_FunRide_From_Exceeding_Max_Entries() {
        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        funride.accept(BicycleType.MountainBike);
        funride.accept(BicycleType.TandemBike);
        assertEquals(3, funride.getEnteredCount());
        funride.accept(BicycleType.RoadBike);
        funride.accept(BicycleType.MountainBike);
        funride.accept(BicycleType.TandemBike);
        assertEquals(3, funride.getEnteredCount());
    }

    //Count

    @Test
    public void should_Return_Count_For_BikeType() {
        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        funride.accept(BicycleType.RoadBike);
        funride.accept(BicycleType.MountainBike);
        funride.accept(BicycleType.MountainBike);
        funride.accept(BicycleType.TandemBike);
        funride.accept(BicycleType.TandemBike);

        assertEquals(1, funride.getCountForType(BicycleType.RoadBike));
        assertEquals(1, funride.getCountForType(BicycleType.MountainBike));
        assertEquals(1, funride.getCountForType(BicycleType.TandemBike));
    }

    @Test
    public void should_Return_Count_For_Bicycles_Entered() {
        FunRide funride = new FunRide(3);
        funride.accept(BicycleType.RoadBike);
        assertEquals(1, funride.getEnteredCount());
        funride.accept(BicycleType.MountainBike);
        assertEquals(2, funride.getEnteredCount());
        funride.accept(BicycleType.TandemBike);
        assertEquals(3, funride.getEnteredCount());
    }
}
