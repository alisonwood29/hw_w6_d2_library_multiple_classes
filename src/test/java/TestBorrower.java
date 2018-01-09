import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(50);
        book = new Book("Catcher in the Rye", "fiction");
        borrower = new Borrower("Alison");
        library.addBook(book);
    }

    @Test
    public void collectionIsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canBorrowFromLibrary(){
        borrower.borrowBook(library);
        assertEquals(0, library.stockCount());
        assertEquals(1, borrower.collectionCount());
    }





}
