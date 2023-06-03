package instagramtask;

import java.util.Comparator;

public class PostSorting implements Comparator<Post>{

    @Override
    public int compare(Post postOne, Post postTwo) {
        int value = postOne.getPostedDate(). compareTo(postTwo.getPostedDate());
        return value;
    } 
}

