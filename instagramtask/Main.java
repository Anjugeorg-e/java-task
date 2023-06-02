package instagramtask;

public class Main {
    public static void main(String[] args) {

        Instagram instagram = new Instagram();

        User sam = new User("sam", "sam@123", "samsamuel@gmail.com");
        sam.createProfile("sam_samuel", "Sam Samuel", "creating my own sunshine", "https://profilepic", instagram);
        Profile sam_profile = sam.getProfile();

        User anu = new User("anu_james", "anu@123", "anu@gmail.com");
        anu.createProfile("anu_james", "Anu james", "blissful", "https://anuprofilepic", instagram);
        Profile anu_profile = anu.getProfile();
        
        System.out.println(instagram.instagramAccounts);
    
        sam_profile.follow(anu_profile);
        anu_profile.follow(sam_profile);
        sam_profile.acceptRequest(anu_profile);
        anu_profile.acceptRequest(sam_profile);

        System.out.println(anu_profile);

        sam_profile.createPost("https:flower.jpg", "sunflower!!!", 23);
        sam_profile.createPost("https://sky.jpg", "sky", 25);
        sam_profile.createReel("https://car.mp4", "road race", 24);
        sam_profile.createStory("Happy birthday", "https://birthdaygirl.png");
        sam_profile.createStory("alone!!!", "https:alone.videomp4");
        System.out.println("total contents in sam's profile: " + sam_profile.getContentCount());
        System.out.println(sam_profile);

        System.out.println("posts: " + sam_profile.posts);
        System.out.println("reels: " + sam_profile.reels);

        anu_profile.likeReel(sam_profile, 24);
        anu_profile.commentReel(sam_profile, 24, "awesome");
        System.out.println("reels: " + sam_profile.reels);
        anu_profile.likePost(sam_profile, 23);
        anu_profile.commentPost(sam_profile, 23, "wow!!");
        anu_profile.commentPost(sam_profile, 23, "beautiful..");
        System.out.println("posts: " + sam_profile.posts);

        System.out.println(anu_profile.getFollowingCount());

        anu_profile.getFeed().addContentsToFeed();
        System.out.println(anu_profile.getFeed());

    }
}
