package challenge.one.models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Host: %s, Description: %s, " +
                        "Duration: %d:%02d, Classification: %d star, Total " +
                        "reproductions: %d%n", super.getTitle(),
                getHost(), getDescription(), super.getDuration() / 60
                , super.getDuration() % 60, getClassification(), super.getTotalReproductions());
    }

    @Override
    public int getClassification() {
        if (getLikes() > 600){
            return 5;
        } else if (getLikes() > 400){
            return 3;
        } else {
            return 1;
        }
    }


}
