package university;

import enums.*;
import exceptions.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import utils.ConnectionPool;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Connection;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    private static final int POOL_SIZE = 5;
    private static final int THREAD_POOL_SIZE = 7;

    public static void main(String[] args) throws BookSeatsException, LabCostsException, NegativeHoursException, IllegalAccessException, NoSuchMethodException {

//
//        //Enums
//        Book newBook = new Book(1,"Head First Java", "Matt wheeler", BookCategories.TextBook, false);
//        Student newStudent = new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.E);
//        Subject newSubject = new Subject("Stats10",  SubjectUnits.Four);
//        SupportStaff staff = new SupportStaff("max",35,true,2,"California", 20,44,4,"Janitor,",40);
//        try{
//            System.out.println(staff.calculateSalary(Compensation.Weekly));
//        }catch (CalculateSalaryException cse){
//            logger.error("Salary cannot be negative");
//        }
//        getIndentLine();
//
//        //5 lambda functions from the java.util.function package.
//        logger.info("Function Interface");
//        //Function that takes professor object and returns integer age.
//        Professor newProfessor = new Professor("James",55,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
//        Function<Professor, Integer> function1 = (professor) -> professor.getAge();
//        System.out.println(function1.apply(newProfessor));
//        getIndentLine();
//        logger.info("Predicate Interface");
//        //Creation of auditorium object to check if the seats are fully booked or not.
//        Auditorium newAuditorium = new Auditorium("Grease");
//        newAuditorium.bookSeats(220);
//        newAuditorium.bookSeats(20);
//        Predicate<Auditorium> auditoriumPredicate = (auditorium) -> {
//            if(auditorium.getAvailableSeats() > 0 || auditorium.getAvailableSeats() <= 250){
//                return true;
//            }else {
//                return false;
//            }
//        };
//        System.out.println("Is auditorium still bookable?: " + auditoriumPredicate.test(newAuditorium));
//        getIndentLine();
//        logger.info("Supplier Interface");
//        //Creating a Supplier interface for bus tha returns the list of bus.
//        Supplier<List<Bus>> busSupplier = () -> {
//            List<Bus> busList = new ArrayList<>();
//            busList.add(new Bus(1,3456,"Julio", 10, 80, null));
//            busList.add(new Bus(2,3465,"Peter", 12, 70, null));
//            busList.add(new Bus(3,3489,"Raymon", 14, 75, null));
//            return busList;
//        };
//        System.out.println(busSupplier.get());
//        getIndentLine();
//        logger.info("Consumer Interface");
//        //Consumer interface that takes a subject and print its title.
//        Consumer<Subject> studentConsumer1 = (subject) -> System.out.println(subject.getTitle());
//        studentConsumer1.accept(new Subject("CISCO", SubjectUnits.Four));
//        getIndentLine();
//        logger.info("BiConsumer Interface");
//        //BiConsumer interface that takes two double values. The BiConsumer created takes the salary per hour of two professors and returns the difference.
//        Professor professorOne = new Professor("Maxwell", 42, true, 3, "Washington", 40.0, 5, 5, "Engineering", 160);
//        Professor professorTwo = new Professor("Maxwell", 42, true, 3, "Washington", 55.0, 5, 5, "Computer Science", 160);
//        BiConsumer<Double, Double> professorBiConsumer = (salaryOne, salaryTwo ) -> {
//            double salaryDifference;
//            if(salaryOne > salaryTwo){
//                System.out.println(salaryDifference = salaryOne - salaryTwo);
//            }else {
//                System.out.println(salaryDifference = salaryTwo - salaryOne);
//            }
//        };
//        professorBiConsumer.accept(professorOne.getSalaryPerHr(), professorTwo.getSalaryPerHr());
//        getIndentLine();
//
//        //Create 3 custom lambda functions with generics
//        //1) Lambda function to filter students who are scholars with grades that are not E or F.
//        List<Student> scholarStudents = new ArrayList<>();
//        scholarStudents.add(new Student("Xavier",19,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.A));
//        scholarStudents.add(new Student("Richard",18,true,3467,"California","St.claire",5, null, Sports.TENNIS, Grades.B));
//        scholarStudents.add(new Student("Nathan",19,true,3568,"California","St.claire",5, null, Sports.TENNIS, Grades.E));
//        scholarStudents.add(new Student("Pablo",120,true,3897,"California","St.claire",5, null, Sports.TENNIS, Grades.F));
//
//        //Creation of condition using predicate interface that takes the students with no Grade E or F.
//        Predicate<Student> studetPredicate = (scholarStudentsList) -> scholarStudentsList.getGrade() != Grades.F && scholarStudentsList.getGrade() != Grades.E;
//        //Here we are passing the predicate to the filter method then collect and print the result.
//        scholarStudents.stream().filter(studetPredicate).collect(Collectors.toList()).forEach(System.out::println);
//        getIndentLine();
//
//        //2)Function that takes Student and return its grade. Another function will take the grade and will return an integer value which is the amount of scholarship
//        Student newLambdaStudent = new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.A);
//        Function<Student, Grades> function2 = (student) -> student.getGrade();
//        Function<Grades, Integer> function3 = (grade) -> grade.getScholarshipAmount();
//        int studentGrade = function2.andThen(function3).apply(newLambdaStudent);
//        System.out.println(studentGrade);
//        getIndentLine();
//
//        //3) Implementation of lambda expression on printing the elements inside the array list using foreach method that takes a consumer.
//        List<LabEquipment> labEquipmentList1 = new ArrayList<>();
//        labEquipmentList1.add(new LabEquipment(1,"Beaker", 10));
//        labEquipmentList1.add(new LabEquipment(1,"Beaker", 10));
//        labEquipmentList1.add(new LabEquipment(3,"Erlenmeyer Flask", 8));
//
//        labEquipmentList1.forEach((labEquipment1) -> System.out.println(labEquipment1));
//        getIndentLine();
//
//        //Add 7 collection streaming in the hierarchy with terminal and non-terminal operations.
//        getIndentLine();
//
//        List<Student> newStudentList = new ArrayList<>();
//        newStudentList.add(new Student("Carlo",19,true,3456,"Los Angeles","St.claire",5, null, Sports.TRACK_AND_FIELD, Grades.A));
//        newStudentList.add(new Student("James",20,true,3478,"San francisco","St.claire",5, null, Sports.SWIMMING, Grades.A));
//        newStudentList.add(new Student("Alexander",20,true,3456,"Fresno","St.claire",9, null, Sports.TRACK_AND_FIELD, Grades.C));
//        newStudentList.add(new Student("Louise",21,false,3478,"Oakland","St.claire",9, null, Sports.TENNIS, Grades.C));
//        newStudentList.add(new Student("Michael",19,true,3423,"Bakersfield","St.claire",0, null, Sports.VOLLEYBALL, Grades.B));
//        newStudentList.add(new Student("Diana",23,false,3413,"Beverly hills","St.claire",0, null, Sports.BASKETBALL, Grades.E));
//        newStudentList.add(new Student("Daniel",22,true,3498,"Anaheim","St.claire",4, null, Sports.TENNIS, Grades.F));
//        newStudentList.add(new Student("Rachelle",20,false,3454,"Huntington beach","St.claire",4, null, Sports.SWIMMING, Grades.B));
//        Classroom classroomStudents = new Classroom(1,"Computer Science",8, newStudentList);
//
//        classroomStudents.getStudents().forEach(System.out::println);
//        getIndentLine();
//
//        //Female students using non-terminal filter and terminal collect.
//        List<Student> femaleStudentsList = newStudentList.stream()
//                .filter(gender -> gender.isMale() == false)
//                .collect(Collectors.toList());
//        System.out.println("Female students: " + femaleStudentsList);
//        getIndentLine();
//
//        //Getting the list of scholar students by using non-terminal filter and non-terminal map.
//        List<String> scholarStudentList = newStudentList.stream()
//                .filter(scholar -> scholar.getGrade() != Grades.F && scholar.getGrade() != Grades.E)
//                .map(scholar -> scholar.getName()).collect(Collectors.toList());
//        System.out.println("Scholar Students:" + scholarStudentList);
//        getIndentLine();
//
//        //Counting the numbers of scholars in the classroom using terminal count.
//        System.out.println("Number of scholars: " + newStudentList.stream()
//                .filter(scholar -> scholar.getGrade() != Grades.F && scholar.getGrade() != Grades.E)
//                .count());
//        getIndentLine();
//
//        //Getting a student that lives in the city of anaheim using anyMatch method.
//        System.out.println("Anaheim resident: " + newStudentList.stream()
//                .anyMatch(student -> student.getStudentAddress() == "Anaheim"));
//        getIndentLine();
//
//        //Getting the first student in the list using findFirst method.
//        System.out.println("First student: " + newStudentList.stream()
//                .findFirst().get());
//        getIndentLine();
//
//        //Getting the oldest student in list using max method.
//        Optional<Student> max = newStudentList.stream()
//                .max((s1, s2) -> s1.getAge() - s2.getAge());
//        if (max.isPresent()) {
//            Student oldestStudent = max.get();
//            System.out.println("The oldest student is: "
//                    + oldestStudent.getName() + " (" + oldestStudent.getAge() + ")");
//        }
//        getIndentLine();
//
//        //checking if there is a student whose sports is football using noneMatch method.
//        boolean noFootballPlayer = newStudentList.stream()
//                .noneMatch(student -> student.getSport() == Sports.FOOTBALL);
//
//        System.out.println("Is no one a football player? " + noFootballPlayer);
//
//        System.out.println("------------------------------------------------------");
//        System.out.println("Create object and call method using the only reflection");
//        System.out.println("------------------------------------------------------");
//
//        Student student = new Student("Sadie",21,false,3498,"Hawkins","St.claire",4, null, Sports.TENNIS, Grades.B);
//        Class studentClass = student.getClass();
//
//        //Getting the class name
//        String className = studentClass.getName();
//        System.out.println("Class name: " + className);
//        getIndentLine();
//
//        //Getting the class modifier
//        int studentModifier = studentClass.getModifiers();
//        String studentModifierName = Modifier.toString(studentModifier);
//        System.out.println("Student class name and modifier: " + studentModifierName + " (" + studentModifier + ")");
//        getIndentLine();
//
//        //Getting the superclass of student class
//        Class superClassOfStudent = studentClass.getSuperclass();
//        System.out.println("Super class: " + superClassOfStudent.getName());
//        getIndentLine();
//
//        //Get all methods from student class.
//        Method[] studentClassMethods = studentClass.getDeclaredMethods();
//        System.out.println("Methods:");
//        //Iterate each method and print their name, modifier name, and return type.
//        for (Method method: studentClassMethods) {
//            //print method name.
//            System.out.println("Name: " + method.getName());
//            //Convert modifier to string and print.
//            String modifierName = Modifier.toString(method.getModifiers());
//            System.out.println("Modifier: " + modifierName);
//            //print return type.
//            System.out.println("Return type: " + method.getReturnType());
//            getIndentLine();
//        }
//        getIndentLine();
//
//        //Get all fields from the student class
//        Field[] studentClassFields = studentClass.getDeclaredFields();
//        System.out.println("Fields:");
//        //Iterate each field and print their name, modifier name, and return type.
//        for (Field field: studentClassFields) {
//            //print name.
//            System.out.println("Name: " + field.getName());
//            //print type.
//            System.out.println("Type: " + field.getType());
//            //Convert modifier to string and print.
//            String modifierName = Modifier.toString(field.getModifiers());
//            System.out.println("Modifier: " + modifierName);
//            getIndentLine();
//        }
//
//        //Changing the value of private field address using reflection.
//        for (Field field: studentClassFields) {
//            //Obtain the address field from the array of fields.
//            if(field.getName().equals("address")){
//                //Making the field accessible.
//                field.setAccessible(true);
//                //Setting a new value for the field.
//                field.set(student, "Bakersfield");
//            }
//        }
//        System.out.println("New address: " + student.getStudentAddress());
//        getIndentLine();
//
//        //Getting the constructors from the student class.
//        Constructor[] studentConstructor = studentClass.getDeclaredConstructors();
//
//
//        for (Constructor constructor: studentConstructor) {
//            //Get name of the parameter
//            System.out.println("Name: " + constructor.getName());
//            String modifier = Modifier.toString(constructor.getModifiers());
//            System.out.println("Modifier: " + modifier);
//            System.out.println("Parameters: " + constructor.getParameterCount());
//        }
        getIndentLine();

        //Runnable thread
        Thread thread1 = new Thread(new Auditorium("Tarzan"));
        Thread thread2 = new Thread(new Auditorium("Grease"));
        thread1.start();
        thread2.start();

        //Runnable thread
        Thread thread3 = new Bus(1, 5,"Xavier", 10, 50, null);
        Thread thread4 = new Bus(2, 10,"Albert", 12, 50, null);
        thread3.start();
        thread4.start();

        //Create a connection pool of size 5.
        ConnectionPool pool = ConnectionPool.getInstance(POOL_SIZE);

        //Create a ThreadPool of size 7.
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        //Create a list of CompletableFutures to store the connection
        List<CompletableFuture<Connection>> futures = new ArrayList<>();

        //Create and submit 7 threads with CompletableFutures to the thread pool.
        for (int i = 0; i < 7; i++) {
            CompletableFuture<Connection> future = CompletableFuture.supplyAsync(pool::getConnection, executorService);
            futures.add(future);
        }

        //Wait until all 7 threads have finished.
        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        // Print out the connection that were obtained.
        futures.forEach(f -> {
            try {
                System.out.println("Obtained connection: " + f.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        //test
    }
    public static void getIndentLine(){
        System.out.println("----------------------");
    }
}
