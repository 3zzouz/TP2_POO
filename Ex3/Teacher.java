package Ex3;

public class Teacher implements LibraryUser {
    LibraryCard card;
    public void borrowBook(Book book) {
        System.out.println("Teacher borrowing book: " + book);
    }
    public void returnBook(Book book) {
        System.out.println("Teacher returning book: " + book);
    }
}
