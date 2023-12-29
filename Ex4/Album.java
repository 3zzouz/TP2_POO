package Ex4;

import java.util.ArrayList;

public class Album {
    ArrayList<Song> songs;
    String title, artist;
    int yearOfRelease, price, numberOfTracks;
    /*methods of album */
    public Album(String title, String artist, int yearOfRelease, int price, int numberOfTracks) {
        this.title = title;
        this.artist = artist;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.numberOfTracks = numberOfTracks;
        songs = new ArrayList<Song>();
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public int getPrice() {
        return price;
    }
    public int getNumberOfTracks() {
        return numberOfTracks;
    }
    public void addSong(Song song) {
        if(songs.contains(song)) {
            System.out.println("Song already in album");
            return;
        }
        songs.add(song);
    }
    public void removeSong(Song song) {
        if(!songs.contains(song)) {
            System.out.println("Song not in album");
            return;
        }
        songs.remove(song);
    }
    public void playSong(Song song) {
        if(!songs.contains(song)) {
            System.out.println("Song not in album");
            return;
        }
        song.playSong();
    }
    public void listAllSongs() {
        for (Song song : songs) {
            System.out.println(song);
        }
    }
    public void displayInformation() {
        System.out.println("Album: " + title + " by " + artist + " (" + yearOfRelease + ")");
        for (Song song : songs) {
            System.out.println("    " + song);
        }
    }
    public String toString() {
        return "Album: " + title + " by " + artist + " (" + yearOfRelease + ")";
    }

}
