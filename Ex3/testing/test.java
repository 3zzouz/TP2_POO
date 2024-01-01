package Ex3.testing;

import Ex3.Book;
import Ex3.Library;
import Ex3.LibraryCard;
import Ex3.LibraryUser;
import Ex3.Notebook;
import Ex3.Novel;
import Ex3.Student;
import Ex3.Teacher;

public class test {
    public static void main(String[] args) {

        Book notebook = new Notebook("Notebook Title", "Notebook Author", "Notebook yearOfPublication", 1, 2, 3);
        Book novel = new Novel("Novel Title", "Novel Author", "Novel yearOfPublication", 1, 2, 3);

        LibraryUser student = new Student(new LibraryCard(1, new Student(null)));
        LibraryUser teacher = new Teacher(new LibraryCard(2, new Teacher(null)));

        Library library = new Library();

        library.addBook(notebook);
        library.addBook(novel);

        library.displayBooks();

        library.lendBook(notebook, student);
        library.lendBook(novel, teacher);

        library.returnBook(notebook, student);
        library.returnBook(novel, teacher);

        library.displayBooks();
    }
}
