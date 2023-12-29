package Ex3;

public class Notebook extends Book {
    public Notebook(String title, String author, String yearOfPublication, int price, int numberOfPages, int edition) {
        super(title, author, yearOfPublication, price, numberOfPages, edition);
    }

    public void displayInformation() {
        System.out.println("Notebook : \n" + "Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of Publication: " + getYearOfPublication());
    }
}
