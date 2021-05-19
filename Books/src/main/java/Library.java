import java.util.ArrayList;
import java.util.HashMap;

public class Library {

//    public static void main(String[] args) {
//        HashMap<String, Integer> bookGenres = new HashMap<String, Integer>();
//
//
//        bookGenres.put("Horror",1);
//        bookGenres.put("Adventure", 2);
//        bookGenres.put("Comedy", 3);
//        bookGenres.put("Autobiography",5);
//        bookGenres.put("selfHelp", 10000);
//    }


    private Integer capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;

    public Library(Integer capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.genres = new HashMap<String, Integer>();
        genres.put("Horror",1);
        genres.put("Adventure", 2);
        genres.put("Comedy", 3);
    }

    public int bookCount() {
        return this.books.size();
    }

    public Object checkCapacity(Book book) {
        if(this.capacity >= this.bookCount()){
            this.books.add(book);
        }
        return "Sorry, Can't add anymore";
    }

    public void addBook(Book book) {
            this.books.add(book);
    }
    public Book removeFromShelf(){
        return this.books.remove(0);
    }
    public Book booksByGenre(){
        return this.genres.forEach((key, value) -> System.out.println(key + "=" + value));

    }

}

