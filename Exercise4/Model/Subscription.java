package Exercise4;

public class Subscription {
    private Website website; // website subscribed to
    private int subscriptionID; // unique subscription ID

    // Constructor
    public Subscription(Website website, int subscriptionID) {
        this.website = website;
        this.subscriptionID = subscriptionID;
    }

    public int getSubscriptionID(){
        return subscriptionID;
    }

    public Website getWebsite(){
        return website;
    }

    // Modify subscription
    public void modifySubscription(Website newWebsite) {
        this.website = newWebsite;
    }

    // Cancel subscription by SubscriptionID
    public void cancelSubscription(int subscriptionID) {
        if (this.subscriptionID == subscriptionID) {
            this.website = null;
            System.out.println("Subscription with the ID " + subscriptionID + " has been cancelled");
        }
    }
}
