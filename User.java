package NotSpotify;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists;

    //Constructor
    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();//list with the playlists
    }

    //Method to create a new specific playlist
    public void createPlaylist(String name, String genre) {
        Playlist playlist = switch (genre) {
            case "Pop" -> new PopPlaylist(name);
            case "Country" -> new ContryPlaylist(name);
            case "Favorite" -> new FavoritePlaylist(name);
            default -> throw new UnsupportedOperationException("Unsupported genre: " + genre);
        };
        //Add the new playlist to the user's playlists
        playlists.add(playlist);
    }

    //Method to delete a playlist
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    //Method to add a song to a playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }

    //Method to remove a song from a playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }

    //Getters
    public List<Playlist> getPlaylists() {
        return playlists;
    }
    public String getUsername() {
        return username;
    }
}