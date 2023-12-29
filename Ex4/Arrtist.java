package Ex4;

import java.util.ArrayList;

public class Arrtist {
    ArrayList<Album> albums;
    String name;
    /*methods of artist */
    public Arrtist(String name) {
        this.name = name;
        albums = new ArrayList<Album>();
    }
    public String getName() {
        return name;
    }
    public void addAlbum(Album album) {
        if(albums.contains(album)) {
            System.out.println("Album already in artist");
            return;
        }
        albums.add(album);
    }
    public void removeAlbum(Album album) {
        if(!albums.contains(album)) {
            System.out.println("Album not in artist");
            return;
        }
        albums.remove(album);
    }
    public void listAllAlbums() {
        for (Album album : albums) {
            System.out.println(album);
        }
    }
}
