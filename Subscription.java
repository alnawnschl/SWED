import java.time.LocalDateTime;

public class Subscription {
    private int subscriptionID;
    private int userID;
    private String websiteURL;
    private String frequency;
    private String communicationChannel;
    private LocalDateTime lastChecked;

    public Subscription(int subscriptionID, int userID, String websiteURL, String frequency, String communicationChannel, LocalDateTime lastChecked) {
        this.subscriptionID = subscriptionID;
        this.userID = userID;
        this.websiteURL = websiteURL;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
        this.lastChecked = lastChecked;
    }

    public int getSubscriptionID() {
        return subscriptionID;
    }

    public void setSubscriptionID(int subscriptionID) {
        this.subscriptionID = subscriptionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(String communicationChannel) {
        this.communicationChannel = communicationChannel;
    }

    public LocalDateTime getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(LocalDateTime lastChecked) {
        this.lastChecked = lastChecked;
    }

    public void modifySubscription(String websiteURL, String frequency, String communicationChannel) {
        this.websiteURL = websiteURL;
        this.frequency = frequency;
        this.communicationChannel = communicationChannel;
    }

    public void cancelSubscription() {
        // Implement cancellation logic here
    }
}

