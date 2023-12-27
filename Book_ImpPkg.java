// File
import BookDetail.Book;

public class Book_ImpPkg {
    public static void main(String[] args) {
        Book book = new Book("One of us is Lying", 250d, "Karen Mcmanus");
        System.out.println("Book Name => " + book.getBookName());
        System.out.println("Price => " + book.getPrice());
        System.out.println("Author Name => " + book.getAuthorName());
    }
}