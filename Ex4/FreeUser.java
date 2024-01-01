package Ex4;

import java.util.ArrayList;

public class FreeUser implements User {
    ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public void listen(Song song) {
        System.out.println("Playing " + song);
    }

    public void addToPlaylist(Song song) {
        System.out.println("Adding " + song + " to playlist");
        Playlist playlist = new Playlist();
        playlist.add(song);
        playlists.add(playlist);
    }

    public void displayPlaylists() {
        System.out.println("Playlists: ");
        for (Playlist playlist : playlists) {
            playlist.displaySongs();
        }
    }
}
