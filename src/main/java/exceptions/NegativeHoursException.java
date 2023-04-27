package exceptions;

public class NegativeHoursException extends Exception{
    public NegativeHoursException(){}

    public NegativeHoursException(String message) {
        super(message);
    }
}
