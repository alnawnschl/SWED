package Exercise4;

import java.util.Date;

public class Website {
    private String URL; // Website URL
    private String websiteContent; // Content of the Website
    private Date lastChecked; // Last time the website was checked

    // Constructor
    public Website(String URL, String websiteContent) {
    this.URL = URL;
    this.websiteContent = websiteContent;
    this.lastChecked = new Date();
    }

    public String getWebsiteContent() {return websiteContent;}
    public Date getLastChecked() {return lastChecked;}
    public String getURL() {return URL;}

    // Update website content
    public void updateContent(String newContent) {
        this.websiteContent = newContent;
        this.lastChecked = new Date();
    }
}