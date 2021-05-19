import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;
//    private HashMap<String, Integer> genres;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "Jrr Tolkien", "Adventure");
        library = new Library(1);
    }
    @Test
    public void testBookNumber(){
        assertEquals(0, library.bookCount());
    }
    @Test
    public void addBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }
    @Test
    public void checkCapacity(){
        library.addBook(book);
        library.addBook(book);
        assertEquals("Sorry, Can't add anymore", library.checkCapacity(book));
    }
//    @Test
//    public void getGenre(){
////        genres.put("Horror",1);
////        Integer numGenres = genres.get("Horror");
//        assertEquals(1,numGenres.toString());
//
//    }



}
