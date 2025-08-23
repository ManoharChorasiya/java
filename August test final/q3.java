import java .util.Scanner;
import java.util.ArrayList;
class Book {
    private int id;
    private String title;
    private String author;
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public int getId(){
      return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public String getFullBookDetails(){
      return id + " : " + title + " : " + author;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void deleteBook(Book book){
        books.remove(book);
    }
    public void displayDetails(){
        for (Book book : books){
            System.out.println(book.getFullBookDetails());
        }
    }
}

    class TestMain{
    public static void main(String[] args){
        Book obj1 = new Book(111,"rules","Ram");
        Book obj2 = new Book(112,"peace","Ramu");
        Book obj3 = new Book(113,"Way of learn","Sita");
        Library library = new Library();
        library.addBook(obj1);
        library.addBook(obj2);
        library.addBook(obj3);

        System.out.println("Books in library:");
        library.displayDetails();
        library.deleteBook(obj2);
        System.out.println("\nAfter deleting one book:");
        library.displayDetails();
    }
}
