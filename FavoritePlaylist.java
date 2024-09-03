package NotSpotify;

public class FavoritePlaylist extends Playlist {
    public FavoritePlaylist(String name) {
        super(name, "Favorite");
    }

    @Override
    public void addSong(Song song) {
        getSongs().add(song);
    }
}