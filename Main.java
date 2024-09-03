package NotSpotify;

public class Main {
    public static void main(String[] args) {
        //User
        User user = new User("BrunoValdez");

        //Playlists
        user.createPlaylist("My Pop Playlist", "Pop");
        Playlist PopPlaylist = user.getPlaylists().get(0);
        user.createPlaylist("My Country Playlist", "Country");
        Playlist CountryPlaylist = user.getPlaylists().get(1);
        user.createPlaylist("MY Favorite Songs Playlist", "Favorite");
        Playlist FavoritePlaylist= user.getPlaylists().get(2);
        //Songs
        Song song1 = new Song("Too Sweet", "Hozier", 4.10, "Country");
        Song song2 = new Song("Easy On Me", "Adele", 3.46, "Pop");
        Song song3 = new Song("Hollywood's Bleeding", "Post Malone", 2.38, "Rap");

        //Add the songs to a playlist
        user.addSongToPlaylist(CountryPlaylist, song1);
        user.addSongToPlaylist(PopPlaylist, song2);
        user.addSongToPlaylist(FavoritePlaylist, song3);

        //Play all songs in a playlist
        System.out.println("Playing all songs in My Pop Playlist:");
        PopPlaylist.playAllSongs();

        //Remove a song a playlist
        user.removeSongFromPlaylist(PopPlaylist, song2);
        System.out.println("Removed " + song2.getTitle() + " from My Pop Playlist");

        //Play all songs in a playlist
        System.out.println("Playing all songs in My Country Playlist:");
        CountryPlaylist.playAllSongs();

        //Delete a playlist
        user.deletePlaylist(PopPlaylist);
        System.out.println("Deleted My Pop Playlist");
    }
}