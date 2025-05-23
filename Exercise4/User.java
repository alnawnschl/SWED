package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class User {
    // USer attributes
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private int userID;

    // User's notification preferences and subscriptions
    private List<Subscription> subscriptions;
    private NotificationPreference notificationPreference;

    // Constructor to initialize the subscriptions list
    public User() {
        this.subscriptions = new ArrayList<>();  // Ensure the subscriptions list is initialized
    }

    // Register User for Updates by subscribing to a website
    public void registerForUpdates(Website website, int subscriptionID) {
        Subscription sub = new Subscription(website, subscriptionID);
        subscriptions.add(sub);
    }

    // Set user's notification preference
    public void specifyNotificationPreference(String channelType, int frequency) {
        this.notificationPreference = new NotificationPreference(channelType, frequency);
    }

    // Display current website subscriptions
    public void manageWebsiteSubscriptions() {
        for (Subscription sub : subscriptions) {
            System.out.println("Subscribed to: " + sub.getWebsite().getURL());
        }
    }

    // Getters and Setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge (int age) {this.age = age;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public int getUserID() {return userID;}
    public void setUserID(int userID) {this.userID = userID;}
}
