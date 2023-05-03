package university;

import java.util.List;

public class Library implements Accessible{

    private int librarianId;
    private int numberOfShelves;
    private int booksCapacity;
    private List<Book> books;

    public Library(int librarianId, int numberOfShelves, int booksCapacity, List<Book> books){
        this.librarianId = librarianId;
        this.numberOfShelves = numberOfShelves;
        this.booksCapacity = booksCapacity;
        this.books = books;
    }

    public Library(){}

    public void setLibrarianId(int librarianId){
        this.librarianId = librarianId;
    }

    public void setNumberOfShelves(int numberOfShelves){
        this.numberOfShelves = numberOfShelves;
    }

    public void setBooksCapacity(int booksCapacity){
        this.booksCapacity = booksCapacity;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public int getLibrarianId(){
        return librarianId;
    }

    public int getNumberOfShelves(){
        return numberOfShelves;
    }

    public int getBooksCapacity(){
        return booksCapacity;
    }

    public List<Book> getBooks(){
        return books;
    }

    @Override
    public void access(){
        System.out.println("Library is accessible");
    }

    @Override
    public String toString() {
        return "Library{" +
                "librarianId=" + librarianId +
                ", numberOfShelves=" + numberOfShelves +
                ", booksCapacity=" + booksCapacity +
                ", books=" + books +
                '}';
    }
}
