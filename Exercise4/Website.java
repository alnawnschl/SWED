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

    // Constructor
    public Website(String URL) {
        this.URL = URL;
        try {
            this.websiteContent = fetchLiveContent();
        } catch (Exception e) {
            this.websiteContent = "";
            System.out.println("Initial fetch failed for " + URL + ": " + e.getMessage());
        }
        this.lastChecked = new Date();
    }


    public String getWebsiteContent() {return websiteContent;}
    public Date getLastChecked() {return lastChecked;}
    public String getURL() {return URL;}

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

    // Update website content
    public void updateContent() {
        try {
            String newContent = fetchLiveContent();
            if (!newContent.equals(this.websiteContent)) {
                this.websiteContent = newContent;
                this.lastChecked = new Date();
                notifyObservers();
            }
        } catch (Exception e) {
            System.out.println("Error fetching content from " + URL + ": " + e.getMessage());
        }
    }

}
