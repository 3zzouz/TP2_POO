package Ex4;

public class Song {
    /* Attributes and methods common to all songs */
    private String title, artist, album;
    private int yearOfRelease, price, numberOfTracks, length;

    /* methods common to all songs */
    public Song(String title, String artist, String album, int yearOfRelease, int price, int numberOfTracks,
            int length) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.numberOfTracks = numberOfTracks;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
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

    public void displayInformation() {
        System.out.println("Song: " + title + " by " + artist + " (" + yearOfRelease + ")");
    }

    public String toString() {
        return "Song: " + title + " by " + artist + " (" + yearOfRelease + ")";
    }

    public void playSong() {
        System.out.println("Playing song: " + title);
    }

    public int getSongLength() {
        return length;
    }
}
