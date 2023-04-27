package exceptions;

public class StudentCountException extends Exception{
    public StudentCountException(){};

    public StudentCountException(String message){
        super(message);
    };
}
