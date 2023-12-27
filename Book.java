// Package
package BookDetail;

public class Book {
    private String bookName;
    private double price;
    private String authorName;

    public Book(String bookName, double price, String authorName) {
        this.bookName = bookName;
        this.price = price;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthorName() {
        return authorName;
    }
}
