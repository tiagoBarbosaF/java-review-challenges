package challenge.one.models;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("Artist: %s, Music: %s, Album: %s, Genre: %s, " +
                        "Duration: %d:%02d, Classification: %d star, Likes: " +
                        "%d, Total reproductions: %d%n", getArtist(),
                super.getTitle(), getAlbum(), getGenre(), super.getDuration() / 60
                , super.getDuration() % 60, getClassification(), super.getLikes(),
                super.getTotalReproductions());
    }

    @Override
    public int getClassification() {
        if (getTotalReproductions() > 900){
            return 5;
        } else if (getTotalReproductions() > 600) {
            return 3;
        } else {
            return 1;
        }
    }
}
