package university;

public class Book extends Library implements Obtainable{

    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int librarianId, int numberOfShelves, int booksCapacity, int bookId, String title, String author, boolean isBorrowed){
        super(librarianId, numberOfShelves, booksCapacity);
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    public Book(int bookId, String title, String author, boolean isBorrowed){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
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

    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
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

    public boolean getIsBorrowed(){
        return isBorrowed;
    }

    @Override
    public void obtain(){
        System.out.println(getTitle() + " was obtained");
    }
}
