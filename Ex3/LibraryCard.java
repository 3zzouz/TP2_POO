package Ex3;

public class LibraryCard {
    private int id;
    private LibraryUser owner;

    public LibraryCard(int id, LibraryUser owner) {
        this.id = id;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public LibraryUser getOwner() {
        return owner;
    }
}
