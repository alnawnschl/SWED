import java.util.List;

public class WebsiteMonitor {
    private int monitorID;
    private List<Subscription> websites;

    public WebsiteMonitor(int monitorID, List<Subscription> websites) {
        this.monitorID = monitorID;
        this.websites = websites;
    }

    public int getMonitorID() {
        return monitorID;
    }

    public void setMonitorID(int monitorID) {
        this.monitorID = monitorID;
    }

    public List<Subscription> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Subscription> websites) {
        this.websites = websites;
    }

    public void checkForUpdates() {
        // Implement logic to check for updates
    }

    public void notifyUser(User user, Notification notification) {
        // Implement logic to notify the user
    }
}

