package Exercise4;

import java.util.Date;

public class Notification {
   private int notificationID;
   private String message;
   private Date timeStamp;

   // Constructor
    public Notification(int notificationID, String message) {
        this.notificationID = notificationID;
        this.message = message;
        this.timeStamp = new Date();
    }

    // Create the message
    public String createMessage() {
        return message;
    }

    // Send the message
    public void sendMessage() {
        System.out.println("Sending Notification: " + message);
    }

    // Getters and Setters
    public Date getTimeStamp() {return timeStamp;}
    public void setTimeStamp(Date timeStamp) {this.timeStamp = timeStamp;}
}
