package NotSpotify;

import java.util.ArrayList;
import java.util.List;

public abstract class Playlist {
    private String name;
    private List<Song> songs;
    private String genre;
    //Constructor
    public Playlist(String name, String genre) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.genre = genre;
    }

    //Method to add songs
    public void addSong(Song song) {
        if (song.getGenre().equals(genre)) {
            songs.add(song);
        } else {
            System.out.println("Song genre does not match playlist genre");
        }
    }
    //Method to remove songs
    public void removeSong(Song song) {
        songs.remove(song);
    }

    //Method to play(print) all songs
    public void playAllSongs() {
        for (Song song : songs) {
            System.out.println(song.getTitle() + ", by " + song.getArtist());
        }
    }

    //Getters
    public String getName() {
        return name;
    }
    public List<Song> getSongs() {
        return songs;
    }
    public String getGenre() {
        return genre;
    }
}