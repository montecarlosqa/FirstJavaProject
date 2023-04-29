package exceptions;

public class BorrowedBookException extends Exception{

    public BorrowedBookException(){}
    public BorrowedBookException(String message){
        super(message);
    }
}
