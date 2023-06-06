package instagramtask;

import java.util.Comparator;

public class contentSorting implements Comparator<Content> {

    @Override
    public int compare(Content arg1, Content arg2) {
        int value = arg1.getPostedDate().compareTo(arg2.getPostedDate());
        return value;
    }
}
