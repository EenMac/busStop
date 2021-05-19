import java.util.ArrayList;

public class Borrower {


    private String name;
    private ArrayList<Book> bookCollection;

    public void Borrower(String name){
        this.name = name;
        this.bookCollection = new ArrayList<Book>();

    }


    public void addBookToBorrowerCollection(Library library) {
        Book book = library.removeFromShelf();
        this.bookCollection.add(book);
    }

    public int collectionCount() {
        return this.bookCollection.size();
    }
}
