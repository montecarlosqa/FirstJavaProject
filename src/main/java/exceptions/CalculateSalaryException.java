package exceptions;

public class CalculateSalaryException extends Exception{
    public CalculateSalaryException(){}
    public CalculateSalaryException(String message){
        super(message);
    }
}
