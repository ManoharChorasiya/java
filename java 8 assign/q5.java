import java.util.ArrayList;
class AddRemoveDetails{
   private ArrayList<Book> al = new ArrayList<Book>();
   public void addBook(Book book){
      al.add (book);
   }
   public void removeBook(Book book){
      al.remove (book);
   }
   public void displayBookDetails(){
      for(Book book : al){
         System.out.println(book.getbookDetails());
      }
   }
}
class Book{
   private String title;
   private String author;
   private long isbn;

   public Book (String title,String author,long isbn){
      this.title = title;
      this.author = author;
      this.isbn = isbn;
   }
   public Book(){}
   public String getbookDetails(){
      return title+":"+author+":"+isbn;
   }
}
class TestMain{
   public static void main(String args[]){
      Book obj1 = new Book(" xyz","yonn",123);
      Book obj2 = new Book(" xyyz","yodha",1233);
      AddRemoveDetails book = new AddRemoveDetails();
      book.addBook(obj1);
      book.addBook(obj2);
      book.displayBookDetails();
      System.out.println("-------------------------");
      book.removeBook(obj2);
        }
}