import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

   private Book book;
   private Library library;
   private Borrower borrower;

   @Before
    public void before(){
       book = new Book("How to kill a Mockingbird", "Some dude", "Some Genre");
       library = new Library(1);
       borrower = new Borrower();
       library.addBook(book);
   }
//   @Test
//   public void canAddBook(){
//      borrower.addBookToBorrowerCollection(library);
//      assertEquals(1, borrower.collectionCount());
//   }

}
