package Ex3;

public class Teacher implements LibraryUser {
    private LibraryCard card;

    public Teacher(LibraryCard card) {
        this.card = card;
    }

    public LibraryCard getCard() {
        return card;
    }

    public void setCard(LibraryCard card) {
        this.card = card;
    }

    public void borrowBook(Book book) {
        System.out.println("Teacher borrowing book: " + book);
    }

    public void returnBook(Book book) {
        System.out.println("Teacher returning book: " + book);
    }
}
