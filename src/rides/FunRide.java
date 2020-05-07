package rides;

import interfaces.Bicycle;
import models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maxEntries;
    private List<BicycleType> list = new ArrayList<BicycleType>();

    public FunRide(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public void accept(BicycleType bikeType) {
        if (this.list.size() < this.maxEntries && !list.contains(bikeType)) {
            list.add(bikeType);
        }
    }

    public int getCountForType(BicycleType bikeType) {
        int bikeCount = 0;
        for (BicycleType bike : list) {
            if (bike == bikeType)
                bikeCount++;
        }
        return bikeCount;
    }

    public int getEnteredCount() {
        return this.list.size();
    }

}