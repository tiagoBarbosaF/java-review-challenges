package challenge.one.main;

import challenge.one.models.Music;
import challenge.one.models.MyFavorites;
import challenge.one.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Dreamers");
        music.setDuration(186);
        music.setArtist("TGC & Embody");
        music.setAlbum("Dreamers");
        music.setGenre("Electronic");

        for (int i = 0; i < 1020; i++) {
            music.like(true);
        }
        for (int i = 0; i < 960; i++) {
            music.like(false);
        }

        for (int i = 0; i < 2000; i++) {
            music.reproduce();
        }
        System.out.println(music);

        Podcast podcast = new Podcast();
        podcast.setTitle("TechTalk Express");
        podcast.setHost("John Smith");
        podcast.setDescription("TechTalk Express is a weekly technology podcast hosted by John Smith. In this podcast, we explore the latest trends and news from the world of technology, discuss exciting innovations, and interview industry experts. Join us to stay updated on what's happening in the world of technology.");
        podcast.setDuration(1800);

        for (int i = 0; i < 330; i++) {
            podcast.like(true);
        }
        for (int i = 0; i < 130; i++) {
            podcast.like(false);
        }
        for (int i = 0; i < 460; i++) {
            podcast.reproduce();
        }
        System.out.println(podcast);

        MyFavorites favorites = new MyFavorites();
        favorites.include(music);
        favorites.include(podcast);
    }
}
