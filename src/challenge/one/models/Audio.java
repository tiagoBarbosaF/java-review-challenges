package challenge.one.models;

public class Audio {
    private String title;
    private int duration;
    private int totalReproductions;
    private int likes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getLikes() {
        return likes;
    }

    public int getClassification() {
        return classification;
    }

    public void like(boolean like) {
        if (like) {
            this.likes += 1;
        } else {
            this.likes -= 1;
        }
    }

    public void reproduce() {
        totalReproductions++;
    }
}
