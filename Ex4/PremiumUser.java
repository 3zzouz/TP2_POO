package Ex4;

public class PremiumUser implements User {
    public void listen(Song song) {
        System.out.println("Playing " + song);
    }
    public void addToPlaylist(Song song) {
        System.out.println("Adding " + song + " to playlist");
    }
}
