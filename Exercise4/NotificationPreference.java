package Exercise4;

public class NotificationPreference {
    private String preferredChannelType; // Email, SMS, etc
    private int frequency; // how often to receive notifications

    // Constructor
    public NotificationPreference(String preferredChannelType, int frequency) {
        this.preferredChannelType = preferredChannelType;
        this.frequency = frequency;
    }

    // Getters and Setters
    public String getPreferredChannelType() {return preferredChannelType;}
    public void setPreferredChannelType(String preferredChannelType) {this.preferredChannelType = preferredChannelType;}

    public int getFrequency() {return frequency;}
    public void setFrequency(int frequency) {this.frequency = frequency;}


}