import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Underworld", "Louis Grodde", "Sci-Fi");
    }
    @Test
    public void hasTitle(){
        assertEquals("Underworld", book.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("Louis Grodde", book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("Sci-Fi", book.getGenre());
    }
}
