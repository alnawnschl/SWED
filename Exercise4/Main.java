package Exercise4;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User(1,"Alina",24,"alina@gmail.com","012345678");

        // Set user notification preference
        user.specifyNotificationPreference("Email", 2);

        // Create website
        Website site1 = new Website("https://swed.com", "solutions to exercise4");
        Website site2 = new Website("https://beispiel2.com", "neue Idee");

        // Register user for Updates
        user.registerForUpdates(site1, 101);
        user.registerForUpdates(site2, 102);

        // Display current subscriptions
        user.manageWebsiteSubscriptions();  // Display the list of subscriptions

        // Modify Subscription
        user.modifySubscription(102, site2);

        // Cancel Subscription
        user.cancelSubscription(101);

        // Update system checks for updates
        UpdateSystem updateSystem = new UpdateSystem();
        boolean isUpdated = false;
        for (Subscription sub : user.getSubscriptions()) {
            if (updateSystem.checkForUpdates(sub.getWebsite())) {
                isUpdated = true;
            }
        }

        // Generate and send notification if updated
        if (isUpdated) {
            NotificationPreference preference = user.getNotificationPreference();
            Notification notification = updateSystem.generateNotification("Website has new content", preference);
            notification.sendMessage();
        } else {
            System.out.println("No recent updates found");
        }
    }
}
