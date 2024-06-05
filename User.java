import java.util.ArrayList;
import java.util.List;

public class User {
    private int userID;
    private String name;
    private String email;
    private String notificationPreferences;
    private List<Subscription> subscriptions;

    public User(int userID, String name, String email, String notificationPreferences) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.notificationPreferences = notificationPreferences;
        this.subscriptions = new ArrayList<>();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotificationPreferences() {
        return notificationPreferences;
    }

    public void setNotificationPreferences(String notificationPreferences) {
        this.notificationPreferences = notificationPreferences;
    }

    public void register() {
        // Implement registration logic here
    }

    public void manageSubscriptions() {
        // Implement subscription management logic here
    }

    public void addSubscription(Subscription subscription) {
        this.subscriptions.add(subscription);
    }

    public void removeSubscription(Subscription subscription) {
        this.subscriptions.remove(subscription);
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }
}
