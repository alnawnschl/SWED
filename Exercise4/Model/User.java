package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    @Override
    public void update(Website website) {
        Notification notification = new Notification(
                "Website " + website.getURL() + " has changed.",
                this.notificationPreference
        );
        notification.sendMessage();
    }

    // User attributes
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private int userID;


    // User's notification preferences and subscriptions
    private List<Subscription> subscriptions;
    private NotificationPreference notificationPreference;

    // Constructor to initialize the subscriptions list
    public User(int userID,String name,int age,String email,String phoneNumber) {
        this.userID = userID; // Initialize userID
        this.subscriptions = new ArrayList<>();  // Ensure the subscriptions list is initialized
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    // Register User for Updates by subscribing to a website
    public void registerForUpdates(Website website, int subscriptionID) {
        Subscription sub = new Subscription(website, subscriptionID);
        subscriptions.add(sub);

        // register Observer
        website.registerObserver(this);
    }


    // Modify subscription
    public void modifySubscription(int subscriptionID, Website newWebsite) {
        for (Subscription sub : subscriptions) {
            if (sub.getSubscriptionID() == subscriptionID) {
                Website oldWebsite = sub.getWebsite();
                oldWebsite.removeObserver(this); // remove old connection
                sub.modifySubscription(newWebsite);
                newWebsite.registerObserver(this); // register new connection
                System.out.println("User " + userID + " modified Subscription with ID " + subscriptionID);
                return;
            }
        }
        System.out.println("User " + userID + " does not have a Subscription with ID " +subscriptionID);
    }

    // Cancel subscription
    public void cancelSubscription(int subscriptionID) {
        for (Subscription sub : subscriptions) {
            if (sub.getSubscriptionID() == subscriptionID) {
                Website website = sub.getWebsite();
                website.removeObserver(this); // Observer deregistrieren
                sub.cancelSubscription(subscriptionID);
                subscriptions.remove(sub);
                System.out.println("User " + userID + " cancelled Subscription with ID " + subscriptionID);
                return;
            }
        }
        System.out.println("User " + userID + " does not have a Subscription with ID " + subscriptionID);
    }


    // Set user's notification preference
    public void specifyNotificationPreference(ChannelType channelType, int frequency) {
        this.notificationPreference = new NotificationPreference(channelType, frequency);
    }

    // Display current website subscriptions
    public void manageWebsiteSubscriptions() {
        for (Subscription sub : subscriptions) {
            System.out.println("User subscribed to following website: " + sub.getWebsite().getURL() + " with the ID: " + sub.getSubscriptionID());
        }
    }

    // Getters and Setters

    public int getUserID() {
        return userID;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge (int age) {this.age = age;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    // Getter for Notification Preferences
    public NotificationPreference getNotificationPreference() {
        return notificationPreference;
    }
}
