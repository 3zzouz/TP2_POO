package Ex3;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library: \n");
        for (Book book : books) {
            book.displayInformation();
        }
    }

    public void removeBook(Book book) throws Exception {
        if (books.size() <= 0)
            throw new Exception("No books in the library");
        books.remove(book);
    }

}
