import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Catcher in the Rye", "fiction");
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void isStockFull(){
        for (int i = 0; i < 12; i++) {
            library.addBook(book);
        }
        assertEquals(10, library.stockCount());
    }
    @Test
    public void canRemoveBook(){
        library.addBook(book);
        Book removedBook = library.removeBook();
        assertEquals(0, library.stockCount());
    }

    }

