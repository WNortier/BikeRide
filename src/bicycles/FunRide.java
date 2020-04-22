package bicycles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunRide {
    private int maxEntries;
    private List<BicycleType> list = new ArrayList<BicycleType>();

    public FunRide(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public String addBikeToRide(BicycleType bikeType) {
        if (this.list.size() < this.maxEntries) {
            list.add(bikeType);
            return "Bike Accepted";
        }
        return "Bike Rejected";
    }

    public int getCountForType(BicycleType bikeType) {
        int bikeCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == bikeType)
                bikeCount++;
        }
        return bikeCount;
    }

    public int getEnteredCount() {
        return this.list.size();
    }


}