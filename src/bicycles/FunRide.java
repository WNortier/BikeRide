package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maxEntries;
    private List<Object> list = new ArrayList<Object>();

    public FunRide(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public void accept(Bicycle bikeType) {
        if (this.list.size() < this.maxEntries) {
            list.add(bikeType);
        }
    }
}