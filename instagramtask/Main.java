package instagramtask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws NullPointerException {

        Instagram instagram = new Instagram();

        User samsamuel = new User("sam_samuel", "sam@123", "samsamuel@gmail.com");
        samsamuel.createProfile("sam_samuel", "creating my own sunshine", "https://profilepic", instagram);
        instagram.addUserToInstagram(samsamuel);
        Profile sam = samsamuel.getProfile();

        User anujames = new User("anu_james", "anu@123", "anu@gmail.com");
        anujames.createProfile("anu_james", "blissful", "https://anuprofilepic", instagram);
        instagram.addUserToInstagram(anujames);
        Profile anu = anujames.getProfile();

        User lucajacob = new User("luca_jacob", "luca123", "luca@gmail.com");
        lucajacob.createProfile("luca_jacob", "weird life", "https://luca.png", instagram);
        instagram.addUserToInstagram(lucajacob);
        Profile luca = lucajacob.getProfile();

        System.out.println(instagram.instagramAccounts);

        sam.follow(anu);
        anu.follow(sam);
        anu.follow(luca);
        luca.follow(anu);
        luca.follow(sam);
        sam.follow(luca);
        sam.acceptFollowRequest(anu);
        anu.acceptFollowRequest(sam);
        luca.acceptFollowRequest(anu);
        sam.acceptFollowRequest(luca);

        sam.createPost("https:flower.jpg", "sunflower!!!", 1, LocalDate.of(2023, 05, 30));
        sam.createPost("https:puppy.jpg", "puppies", 2, LocalDate.of(2023, 06, 01));
        sam.createPost("https://sky.jpg", "sky", 3, LocalDate.of(2023, 05, 23));

        sam.createReel("https://car.mp4", "road race", 3, LocalDate.of(2023, 06, 01));
        sam.createReel("https://computer.mp4", "dark series", 4, LocalDate.of(2023, 05, 25));
        sam.createReel("https://village.mp4", "beautyy", 7, LocalDate.of(2023, 05, 29));

        anu.createPost("https://cat.jpg", "cat", 10, LocalDate.of(2023, 06, 02));
        luca.createPost("https://book.jpg", "java basics", 8, LocalDate.of(2023, 06, 02));

        System.out.println("posts: " + sam.posts);
        System.out.println("reels: " + sam.reels);

        anu.likeReel(sam, 3);
        anu.commentReel(sam, 3, "awesome");
        anu.likePost(sam, 1);
        anu.commentPost(sam, 1, "wow!!");
        anu.commentPost(sam, 1, "beautiful..");

        System.out.println("posts: " + sam.posts);
        System.out.println(anu.getFollowingCount());

        System.out.println("found or not: " + anu.searchProfile("sam_samuel", instagram));
        sam.addTag("#kerala,#feel the beauty", 1);

        sam.createStory("Happy birthday", "https://birthdaygirl.png", LocalDate.of(2023, 06, 03), 4);
        sam.createStory("alone!!!", "https:alone.videomp4", LocalDate.of(2023, 06, 04), 5);
        System.out.println(sam.stories);

        anu.getFeed().addContentsToFeed();

        anu.getFeed().sharePost(sam, 1, "sam_samuel");
        luca.getFeed().sharePost(sam, 2, "sam_samuel");
        anu.getFeed().sharePost(sam, 3, "sam_samuel");
        System.out.println();
        
        System.out.println(anu.getFeed());
        System.out.println();
        System.out.println(sam.getInbox());

    }
}
