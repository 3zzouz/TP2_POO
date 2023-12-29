package Ex3;

public abstract class Book {
    private String title, author, yearOfPublication;
    private int price, numberOfPages, edition;

    public Book(String title, String author, String yearOfPublication, int price, int numberOfPages, int edition) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getEdition() {
        return edition;
    }

    public abstract void displayInformation();

    public String toString() {
        return "Book: " + title + " by " + author + " (" + yearOfPublication + ")";
    }
}
