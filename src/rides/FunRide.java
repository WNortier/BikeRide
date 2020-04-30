package rides;

import models.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maxEntries;
    private List<BicycleType> list = new ArrayList<BicycleType>();

    public FunRide(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public String accept(BicycleType bikeType) {
        if (this.list.size() < this.maxEntries && !list.contains(bikeType)) {
            list.add(bikeType);
            return "Bike Accepted";
        } else if (this.list.size() < this.maxEntries && list.contains(bikeType)) {
            return "Error - Duplicate Bike";
        } else if (this.list.size() == this.maxEntries) {
            return "Error - Ride Full";
        }
        return null;
    }

        public int getCountForType (BicycleType bikeType){
            int bikeCount = 0;
            for (BicycleType bike : list) {
                if (bike == bikeType)
                    bikeCount++;
            }
            return bikeCount;
        }

        public int getEnteredCount () {
            return this.list.size();
        }


    }