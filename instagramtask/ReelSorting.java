package instagramtask;

import java.util.Comparator;

public class ReelSorting implements Comparator<Reel> {

    @Override
    public int compare(Reel reelOne, Reel reelTwo) {
        int value=reelOne.getPostedDate().compareTo(reelTwo.getPostedDate());
        return value;
    }
}

