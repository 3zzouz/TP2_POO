package Ex4;

import java.util.*;

public class Playlist {
    User user;
    ArrayList<Song> songs;
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    public void add(Song song) {
        songs.add(song);
    }
    public void remove(Song song) {
        songs.remove(song);
    }
    public void sufflePlaylist(){
        Collections.shuffle(songs);
    }
}
