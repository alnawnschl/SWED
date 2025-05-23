package Exercise4;

public class Subscription {
    private Website website; // website subscribed to
    private int subscriptionID; // unique subscription ID

    // Constructor
    public Subscription(Website website, int subscriptionID) {
        this.website = website;
        this.subscriptionID = subscriptionID;
    }

    // Modify subscription
    public void modifySubscription(Website newWebsite) {
        this.website = newWebsite;
    }

    // Cancel subscription by nullifying the website
    public void cancelSubscription() {
        this.website = null;
    }

    // Getter
    public Website getWebsite() {return website;}

}
