package Observer;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaPlatform implements Subject {
    private List<Observer> observers;

    public SocialMediaPlatform() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message, NotificationType type) {
        for (Observer observer : observers) {
            observer.update(message, type);
        }
    }

    public void postUpdate(String message) {
        // Notify all observers with different types of notifications
        notifyObservers(message, NotificationType.PUSH_NOTIFICATION);
        notifyObservers(message, NotificationType.EMAIL);
        notifyObservers(message, NotificationType.NEWS_FEED);
    }
}
