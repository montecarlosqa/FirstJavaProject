package exceptions;

public class BusCapacityException extends Exception{
    public BusCapacityException(){}

    public BusCapacityException(String message){
        super(message);
    }
}
