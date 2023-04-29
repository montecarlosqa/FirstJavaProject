package university;

public class Library implements Accessible{

    private int librarianId;
    private int numberOfShelves;
    private int booksCapacity;

    public Library(int librarianId, int numberOfShelves, int booksCapacity){
        this.librarianId = librarianId;
        this.numberOfShelves = numberOfShelves;
        this.booksCapacity = booksCapacity;
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

    public int getLibrarianId(){
        return librarianId;
    }

    public int getNumberOfShelves(){
        return numberOfShelves;
    }

    public int getBooksCapacity(){
        return booksCapacity;
    }

    @Override
    public void access(){
        System.out.println("Library is accessible");
    }
}
