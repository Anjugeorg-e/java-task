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

        System.out.println(instagram.instagramProfiles);

        sam.follow(anu);
        anu.follow(sam);
        anu.follow(luca);
        luca.follow(anu);
        luca.follow(sam);
        sam.follow(luca);

        Post samPostOne = new Post("https://car.png", "car...", sam, 1, LocalDate.of(2023, 03, 05));
        samPostOne.uploadPost();
        Post samPostTwo = new Post("https:puppy.jpg", "puppies", sam, 2, LocalDate.of(2023, 06, 01));
        samPostTwo.uploadPost();
        Post samPostThree = new Post("https:flower.jpg", "flowers", sam, 3, LocalDate.of(2023, 05, 01));
        samPostThree.uploadPost();

        Reel samreelOne = new Reel("https://car.mp4", "car..//", sam, 4, LocalDate.of(2023, 05, 05));
        samreelOne.uploadReel();
        Reel samreelTwo = new Reel("https://toy.mp4", "toyzz", sam, 5, LocalDate.of(2023, 06, 01));
        samreelTwo.uploadReel();

        Story samStoryOne = new Story("happy birthday", sam, 6, LocalDate.of(2023, 06, 04), "https://happy birthday");
        samStoryOne.uploadStory();
        Story samStoryTwo = new Story("new phone", sam, 7, LocalDate.of(2023, 06, 03), "https://iphone14.png");
        samStoryTwo.uploadStory();

        System.out.println();
        samPostOne.like(luca);
        samPostOne.like(anu);
        samPostOne.like(sam);
        samreelOne.like(luca);
        samPostOne.comment(anu, "good!!");
        samPostOne.editContent("beautiful life!@!");
        samreelOne.editContent("wow!!2!!");
        System.out.println();
        samPostOne.comment(luca, "wow..super!!!");
        samPostThree.comment(anu, "this is so nyz...");
        samreelOne.comment(luca, "awesome!");

        // samPostOne.delete();
        // samreelOne.delete();

        samreelOne.setView(luca);
        samreelOne.setView(anu);

        samPostOne.addTag("#beauty..");
        samreelOne.addTag("#kerala..#beauty");

        System.out.println("Sam: " + sam.posts);
        System.out.println("stories:" + sam.stories);

        System.out.println();

        samPostOne.share(luca);
        samreelOne.share(luca);
        samStoryOne.share(luca);
        System.out.println(luca.getInbox());
        
        samStoryOne.deleteStory();
        System.out.println();
        System.out.println("Anu's feed: " + anu.getFeed());

    }
}
