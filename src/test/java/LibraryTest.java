import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library libraryStock;
    Book book;

    @Before
    public void before(){
        book = new Book("Underworld", "Louis Grodde", "Sci-Fi");
        libraryStock = new Library("MyLibrary", 3);
    }

    @Test
    public void hasName(){
        assertEquals("MyLibrary", libraryStock.getName());
    }

    @Test
    public void canAddBook(){
        libraryStock.addBook(book);
        assertEquals(1, libraryStock.bookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, libraryStock.getCapacity());
    }

    @Test
    public void maxCapacity(){
        assertEquals(3, libraryStock.stockFull());
    }

}
