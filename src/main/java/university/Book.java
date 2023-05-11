package university;

import enums.BookCategories;

public class Book implements Obtainable{

    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;
    private BookCategories bookCategory;

    public Book(int bookId, String title, String author, BookCategories bookCategory, boolean isBorrowed){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.bookCategory = bookCategory;
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

    public void setBookCategory(BookCategories bookCategory){
        this.bookCategory = bookCategory;
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

    public BookCategories getBookCategory(){
        return bookCategory;
    }

    public boolean getIsBorrowed(){
        return isBorrowed;
    }

    @Override
    public void obtain(){
        System.out.println(getTitle() + " was obtained");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isBorrowed=" + isBorrowed +
                ", bookCategory=" + bookCategory +
                '}';
    }
}
