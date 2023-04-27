package exceptions;

public class OccupiedSeatsException extends Exception{

    public OccupiedSeatsException(){}
    public OccupiedSeatsException(String message){
        super(message);
    }
}
