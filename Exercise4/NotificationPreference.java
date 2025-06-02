package Exercise4;

public class NotificationPreference {
    private ChannelType preferredChannelType;
    private int frequency;

    // Constructor
    public NotificationPreference(ChannelType preferredChannelType, int frequency) {
        this.preferredChannelType = preferredChannelType;
        this.frequency = frequency;
    }

    // Getters and Setters
    public ChannelType getPreferredChannelType() {return preferredChannelType;}
    public void setPreferredChannelType(ChannelType preferredChannelType) {this.preferredChannelType = preferredChannelType;}

    public int getFrequency() {return frequency;}
    public void setFrequency(int frequency) {this.frequency = frequency;}


}