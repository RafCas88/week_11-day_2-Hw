import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Book book1;

    @Before
    public void before(){
        book = new Book("Harry Potter 1","Rowling", "Magic");
        book1 = new Book();

    }

    @Test
    public void bookCountStartsAt0(){
        assertEquals(0, book.bookCount());
    }

    @Test
    public void canAddBook(){
        book.addBook(book);
        assertEquals(1, book.bookCount());
    }

}


