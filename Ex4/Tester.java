package Ex4;

public class Tester {
    public static void main(String[] args) {
        // Create some songs
        Song song1 = new Song("Song Title 1", "Artist 1", "Album 1", 2001, 10, 10, 180);
        Song song2 = new Song("Song Title 2", "Artist 2", "Album 2", 2002, 20, 10, 180);

        // Create an album
        Album album = new Album("Album 1", "Artist 1", 2001, 10, 10);
        album.addSong(song1);
        album.addSong(song2);

        // Create an artist
        Arrtist artist = new Arrtist("Artist 1");
        artist.addAlbum(album);

        // Create a playlist
        Playlist playlist = new Playlist();
        playlist.add(song1);
        playlist.add(song2);

        // Create a free user
        FreeUser freeUser = new FreeUser();
        freeUser.listen(song1);
        freeUser.addToPlaylist(song1);

        // Create a premium user
        PremiumUser premiumUser = new PremiumUser();
        premiumUser.listen(song2);
        premiumUser.addToPlaylist(song2);

        // Display the user's playlists
        System.out.println("Free user's playlists: ");
        freeUser.displayPlaylists();
        System.out.println("Premium user's playlists: ");
        premiumUser.displayPlaylists();
    }
}
