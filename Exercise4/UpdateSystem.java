package Exercise4;

import java.util.Date;
import java.util.List;

public class UpdateSystem {

    // Check if the website was updates recently
    public boolean checkForUpdates(Website website) {
        Date now = new Date();
        long diff = now.getTime() - website.getLastChecked().getTime();
        return diff < 86400000; // Check if updates within the last 24 hours
    }

    // Generate and return a notification
    public Notification generateNotification(String message) {
        Notification notification = new Notification(1, message);
        notification.createMessage();
        return notification;
    }
}