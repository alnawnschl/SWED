package Exercise4;

import java.util.Date;

public class Notification {
    private static int counter = 0;
    private int notificationID;
    private String message;
    private Date timeStamp;
    private NotificationPreference notificationPreference;

    // Constructor
    public Notification(String message, NotificationPreference notificationPreference) {
        this.notificationID = ++counter;
        this.message = message;
        this.timeStamp = new Date();
        this.notificationPreference = notificationPreference ;
    }

    public int getNotificationID() {
        return notificationID;
    }

    // Create the message
    public String createMessage() {
        return "Notification ID: " + notificationID +
                "\nMessage: " + message +
                "\nTimestamp: " + timeStamp.toString() +
                "\nPreferred Channel: " + notificationPreference.getPreferredChannelType() +
                "\nFrequency: Every " + notificationPreference.getFrequency() + " days";
    }

    // Send the message
    public void sendMessage() {
        System.out.println("Sending Notification: \n" + createMessage());
    }

}
