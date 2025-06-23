package Exercise4;

import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Website implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    private String URL;
    private String websiteContent;
    private Date lastChecked;

    // This holds the strategy for comparing website content
    private ContentComparison comparisonStrategy;

    // Constructor that uses the default comparison strategy (HTML comparison)
    public Website(String URL) {
        this(URL, new HtmlContentComparison());
    }

    // Constructor where you can set a custom comparison strategy
    public Website(String URL, ContentComparison strategy) {
        this.URL = URL;
        this.comparisonStrategy = strategy;
        try {
            this.websiteContent = fetchLiveContent();
        } catch (Exception e) {
            this.websiteContent = "";
            System.out.println("Failed to get initial content from " + URL + ": " + e.getMessage());
        }
        this.lastChecked = new Date();
    }

    // Getter for the current comparison strategy
    public ContentComparison getComparisonStrategy() {
        return comparisonStrategy;
    }

    // Setter to change the comparison strategy later if needed
    public void setComparisonStrategy(ContentComparison strategy) {
        this.comparisonStrategy = strategy;
    }

    public String getWebsiteContent() {
        return websiteContent;
    }

    public Date getLastChecked() {
        return lastChecked;
    }

    public String getURL() {
        return URL;
    }

    // Fetch the current content from the website URL
    public String fetchLiveContent() throws Exception {
        URL url = new URL(this.URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        connection.disconnect();

        return content.toString();
    }

    // Checks for content changes using the selected comparison strategy
    // If there is a change, update content, update lastChecked, and notify observers
    public void updateContent() {
        try {
            String newContent = fetchLiveContent();
            if (!comparisonStrategy.isContentIdentical(this.websiteContent, newContent)) {
                this.websiteContent = newContent;
                this.lastChecked = new Date();
                notifyObservers();
            }
        } catch (Exception e) {
            System.out.println("Error while fetching content from " + URL + ": " + e.getMessage());
        }
    }
}
