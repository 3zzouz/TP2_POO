package Ex3;

public class Student implements LibraryUser {
    LibraryCard card;
    public void borrowBook(Book book) {
        System.out.println("Student borrowing book: " + book);
    }
    public void returnBook(Book book) {
        System.out.println("Student returning book: " + book);
    }
}
