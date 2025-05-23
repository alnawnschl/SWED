package Exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User();
        user.setName("Alina");
        user.setAge(24);
        user.setEmail("alina@gmail.com");
        user.setPhoneNumber("1234 5678910");
        user.setUserID(1);

        // Set user notification preference
        user.specifyNotificationPreference("Email", 2);

        // Create a website and subscribe
        Website site = new Website("https://swed.com", "solutions to exercise4");
        user.registerForUpdates(site, 101);

        // manage and display current subscriptions
        user.manageWebsiteSubscriptions();

        // Update system checks for updates
        UpdateSystem updateSystem = new UpdateSystem();
        boolean isUpdated = updateSystem.checkForUpdates(site);

        // Generate and send notification if updated
        if (isUpdated) {
            Notification notification = updateSystem.generateNotification("Website has new content");
            notification.sendMessage();
        } else {
            System.out.println("No recent updates found");
        }
    }
}
