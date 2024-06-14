package Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, NotificationType type) {
        System.out.println("Notification to " + name + " via " + type + ": " + message);
    }
}
