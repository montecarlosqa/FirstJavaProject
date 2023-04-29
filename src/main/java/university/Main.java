package university;

import exceptions.*;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws OccupiedSeatsException, LabCostsException, NegativeHoursException{


          Auditorium auditorium1 = new Auditorium(250, "Lion king");
          LabEquipment labEquipment = new LabEquipment(5,5,"Science lab",6,"Dropper", 50);
          Professor professor1 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
          System.out.println("------------------------------");
          try{
              Professor prof = new Professor("James",60,true,30,"Ohio",-50,7,25,"Computer Science", 5);
              System.out.println(prof.calculateSalary());
          }catch (CalculateSalaryException cse){
              System.out.println("Salary cannot be negative");
          }
          System.out.println("------------------------------");
          try{
              Book book = new Book(3,"Alchemist", "Paulo",false);
              Student student = new Student("carlo", 23, true, 6,"california", "st.claire", 7);
              student.borrowBook(book);
          }catch (BorrowedBookException bce){
              System.out.println("This book is already borrowed");
          }

//          try(Scanner in = new Scanner(System.in)){
//                System.out.print("Enter a double: ");
//                double number = in.nextDouble();
//                System.out.printf("You've entered: %.1f", number);
//          }

//          logger.error("error");

    }
}
