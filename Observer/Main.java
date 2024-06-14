package Observer;

public class Main {
    public static void main(String[] args) {
        SocialMediaPlatform platform = new SocialMediaPlatform();

        User user1 = new User("Arthi Sri");
        User user2 = new User("xyz");

        platform.registerObserver(user1);
        platform.registerObserver(user2);

        platform.postUpdate("New update from your favorite person!");

        platform.unregisterObserver(user1);

        platform.postUpdate("Another update!");
    }
}

