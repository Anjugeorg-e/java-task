package instagramtask;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws NullPointerException{

        Instagram instagram = new Instagram();

        User sam = new User("sam_samuel", "sam@123", "samsamuel@gmail.com");
        sam.createProfile("sam_samuel", "creating my own sunshine", "https://profilepic", instagram);
        Profile sam_profile = sam.getProfile();

        User anu = new User("anu_james", "anu@123", "anu@gmail.com");
        anu.createProfile("anu_james", "blissful", "https://anuprofilepic", instagram);
        Profile anu_profile = anu.getProfile();
        System.out.println(instagram.instagramAccounts);
    
        sam_profile.follow(anu_profile);
        anu_profile.follow(sam_profile);
        sam_profile.acceptRequest(anu_profile);
        anu_profile.acceptRequest(sam_profile);

        System.out.println(anu_profile);
        
        sam_profile.createPost("https:flower.jpg", "sunflower!!!", 1, LocalDate.of(2023, 05, 30));
        sam_profile.createPost("https:puppy.jpg", "puppies", 2, LocalDate.of(2023, 06, 01));
        sam_profile.createPost("https://sky.jpg", "sky", 3,LocalDate.of(2023, 05, 23));

        sam_profile.createReel("https://car.mp4", "road race", 3, LocalDate.of(2023, 06, 01));
        sam_profile.createReel("https://computer.mp4", "dark series", 4, LocalDate.of(2023, 05, 25));
        sam_profile.createReel("https://village.mp4", "beautyy", 7, LocalDate.of(2023, 05, 29));
       
        System.out.println("total contents in sam's profile: " + sam_profile.getContentCount());
        System.out.println(sam_profile);

        System.out.println("posts: " + sam_profile.posts);
        System.out.println("reels: " + sam_profile.reels);
 
        anu_profile.likeReel(sam_profile, 3);
        anu_profile.commentReel(sam_profile, 3, "awesome");
        System.out.println("reels: " + sam_profile.reels);
        anu_profile.likePost(sam_profile, 1);
        anu_profile.commentPost(sam_profile, 1, "wow!!");
        anu_profile.commentPost(sam_profile, 1, "beautiful..");
        
        System.out.println("posts: " + sam_profile.posts);

        System.out.println(anu_profile.getFollowingCount());

        System.out.println();
        System.out.println("found or not: "+anu_profile.searchProfile("sam_samuel", instagram));
        
        System.out.println(sam_profile.receivedPostsFromOtherProfiles);
        sam_profile.addTag("#kerala,#feel the beauty", 1);
        
        System.out.println(sam_profile.posts);
        System.out.println(LocalDate.now());
        System.out.println(sam_profile.stories);
        sam_profile.createStory("Happy birthday", "https://birthdaygirl.png", LocalDate.of(2023,06,03),4);
        sam_profile.createStory("alone!!!", "https:alone.videomp4", LocalDate.of(2023, 06, 01),5);

        System.out.println(sam_profile.stories);
        System.out.println();
        anu_profile.getFeed().addContentsToFeed();
        System.out.println(anu_profile.getFeed());

    }
}
