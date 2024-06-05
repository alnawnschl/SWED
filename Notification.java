import java.time.LocalDateTime;

public class Notification {
    private int notificationID;
    private int subscriptionID;
    private String message;
    private LocalDateTime timestamp;

    public Notification(int notificationID, int subscriptionID, String message, LocalDateTime timestamp) {
        this.notificationID = notificationID;
        this.subscriptionID = subscriptionID;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public int getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void generateNotification(int subscriptionID, String message) {
        // Implement logic to generate a notification
        this.subscriptionID = subscriptionID;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public void deliverNotification(User user) {
        // Implement logic to deliver the notification to the user
    }
}

