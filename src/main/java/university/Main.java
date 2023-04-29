package university;

import exceptions.*;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws OccupiedSeatsException, LabCostsException, NegativeHoursException, StudentCountException, BusCapacityException{


          Auditorium auditorium1 = new Auditorium(50, "Lion king");
          LabEquipment labEquipment = new LabEquipment(5,5,"Science lab",6,"Dropper", 50);
          labEquipment.obtain();
          Classroom classroom1 = new Classroom(3,"Math classroom",50);
          Bus bus1 = new Bus(1, 1, "John", 5, -1);
          Professor professor1 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
          System.out.println("------------------------------");
          try{
              Professor prof = new Professor("James",60,true,30,"Ohio",1,7,25,"Computer Science", 160);
              System.out.println(prof.calculateSalary());
          }catch (CalculateSalaryException cse){
              System.out.println("Salary cannot be negative");
          }
          System.out.println("------------------------------");
//          try(Scanner in = new Scanner(System.in)){
//                System.out.print("Enter a double: ");
//                double number = in.nextDouble();
//                System.out.printf("You've entered: %.1f", number);
//          }

//          logger.error("error");
    }
}
