import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Catcher in the Rye");
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
    

}
