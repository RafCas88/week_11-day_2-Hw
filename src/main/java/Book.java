import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String genre;
    private int capacity;
    private ArrayList<Book> books;

    public Book (String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(this.bookCount() < this.capacity)
        this.books.add(book);
    }
}
