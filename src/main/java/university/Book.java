package university;

public class Book extends Library implements Obtainable{

    private int bookId;
    private String title;
    private String author;

    public Book(int librarianId, int numberOfShelves, int booksCapacity, int bookId, String title, String author){
        super(librarianId, numberOfShelves, booksCapacity);
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public void obtain(){
        System.out.println(getTitle() + " was obtained");
    }
}
