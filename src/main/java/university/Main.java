package university;

import enums.*;
import exceptions.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws BookSeatsException, LabCostsException, NegativeHoursException{

        //BookSeatsException will be thrown if we booked less than 0, or more than the available seats.
        Auditorium auditorium1 = new Auditorium("Lion king");
        System.out.println(auditorium1.bookSeats(220));
        //costs cannot be less than 0
        LabEquipment labEquipment = new LabEquipment(5,"Beaker",1);
        //working hours cannot be less than 0.
        Professor professor1 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
        getIndentLine();
        //If the salary per hour is negative, the calculate salary method will return negative value and throw the CalculateSalaryException
        try{
            Professor prof = new Professor("James",60,true,30,"Ohio",-1,7,25,"Computer Science", 5);
            System.out.println(prof.calculateSalary(Compensation.Yearly));
        }catch (CalculateSalaryException cse){
            logger.error("Salary cannot be negative");
        }
        getIndentLine();
        //if isBorrowed property from Book object is true, custom exception is thrown if borrowBook method from student class is invoked,
        try{
            Book book = new Book(3,"Alchemist", "Paulo", BookCategories.Novel,false);
            Student student = new Student("carlo", 23, true, 6,"california", "st.claire", 7, null, Sports.BASKETBALL, Grades.A);
            student.borrowBook(book);
        }catch (BorrowedBookException bce){
            logger.error("This book is already borrowed");
        }
//        getIndentLine();
//        //using scanner as a resource
//        try(Scanner in = new Scanner(System.in)){
//            System.out.print("Enter a double: ");
//            double number = in.nextDouble();
//            System.out.printf("You've entered: %.1f\n", number);
//        }
        getIndentLine();
        //creating book objects to insert in a list
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"Batman","Paulo", BookCategories.Novel,true));
        bookList.add(new Book(2,"Superman","Steven", BookCategories.Novel,false));
        //creating library object that takes a list of books.
        Library library = new Library(1,10,50, bookList);
        List<Book> libraryBooks = library.getBooks();
        System.out.println(libraryBooks);
        getIndentLine();
        //creating class objects to insert in a class list
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject("Stats10",  SubjectUnits.Four));
        subjectList.add(new Subject("ECON103",  SubjectUnits.Five));
        //creating student object that takes a list of classes
        Student student1 = new Student("Pedro", 21, true, 3,"California", "St. John", 3, subjectList, Sports.BASEBALL, Grades.C);
        List<Subject> studentSubjectList = student1.getSubjects();
        System.out.println(studentSubjectList);
        getIndentLine();
        //creating student objects to insert in a student list
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Carlo",16,true,3456,"California","St.claire",5, null, Sports.TRACK_AND_FIELD, Grades.B));
        studentList.add(new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.SWIMMING, Grades.D));
         //creating bus object that takes a list of students.
        Bus bus = new Bus(5,123,"Miguel",3,50,studentList);
        List<Student> busStudentList = bus.getStudents();
        System.out.println(busStudentList);
        getIndentLine();
        //creating classroom object that takes a list of students.
        Classroom classroom = new Classroom(1,"Math class",50,studentList);
        List<Student> classroomStudentList = classroom.getStudents();
        System.out.println(classroomStudentList);
        getIndentLine();
        //creating lab equipment objects to insert in a lab equipment list
        List<LabEquipment> labEquipmentList = new ArrayList<>();
        labEquipmentList.add(new LabEquipment(1,"Test tube", 10));
        labEquipmentList.add(new LabEquipment(2,"Flash",8));
        //creating lab object that takes a list of lab equipments
        Lab lab = new Lab(3, 4, "Science lab", labEquipmentList);
        List<LabEquipment> laboratoryLabEquipmentList = lab.getLabEquipment();
        System.out.println(laboratoryLabEquipmentList);
        getIndentLine();
        //Custom Generic LinkedList for borrowed books
        GenericLinkedList<Book> borrowedBooks = new GenericLinkedList();
        borrowedBooks.addFirst(new Book(1,"Java for dummies", "Steve Nolan", BookCategories.TextBook,true));
        borrowedBooks.addLast(new Book(1,"Intermediate Python", "Mosh Gupta", BookCategories.TextBook, true));
        borrowedBooks.add(2, new Book(1,"Fundamentals of programming", "Lilibeth Kruger", BookCategories.TextBook,true));
        borrowedBooks.print();
        getIndentLine();

        //FileUtil and StringUtil implementation
        logger.info("Homecoming Announcement");

        try {
            //The file that we are reading.
            String homecomingFile = FileUtils.readFileToString(new File("src/main/resources/homecoming.txt"));
            System.out.println(homecomingFile);

            //Splitting the lower cased words from the homecoming file.
            String[] wordsFromHomecomingFile = StringUtils.split(homecomingFile.toLowerCase(), " ");

            //returns a stream consisting of distinct elements in a stream and counts them.
            String countUniqueWords = String.valueOf(Arrays.stream(wordsFromHomecomingFile).distinct().count());

            //Specifies the location of the file where we will write the number of unique words.
            FileUtils.writeStringToFile(new File("src/main/resources/words.txt"), "Number of unique words: " + countUniqueWords);

            //Reads the file that contains the number of unique words.
            String newFileContent = FileUtils.readFileToString(new File("src/main/resources/words.txt"));
            System.out.println(newFileContent);

        }catch (IOException ioE){
            logger.error("An error has occurred: " + ioE);
        }
        getIndentLine();

        //Enums
        Book newBook = new Book(1,"Head First Java", "Matt wheeler", BookCategories.TextBook, false);
        Student newStudent = new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.E);
        Subject newSubject = new Subject("Stats10",  SubjectUnits.Four);
        SupportStaff staff = new SupportStaff("max",35,true,2,"California", 20,44,4,"Janitor,",150);
        try{
            System.out.println(staff.calculateSalary(Compensation.Monthly));
        }catch (CalculateSalaryException cse){
            logger.error("Salary cannot be negative");
        }
        getIndentLine();

        //5 lambda functions from the java.util.function package.
        logger.info("Function Interface");
        //Function that takes professor object and returns integer age.
        Professor newProfessor = new Professor("James",55,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
        Function<Professor, Integer> function1 = (professor) -> professor.getAge();
        System.out.println(function1.apply(newProfessor));

        logger.info("Predicate Interface");
        //Creation of auditorium object to check if the seats are fully booked or not.
        Auditorium newAuditorium = new Auditorium("Grease");
        newAuditorium.bookSeats(220);
        Predicate<Auditorium> auditoriumPredicate = (auditorium) -> {
            if(auditorium.getAvailableSeats() > 0 || auditorium.getAvailableSeats() <= 250){
                return true;
            }else {
                return false;
            }
        };
        System.out.println(auditoriumPredicate.test(newAuditorium));

        logger.info("Supplier Interface");
        //Creating a Supplier interface for bus tha returns the list of bus.
        Supplier<List<Bus>> busSupplier = () -> {
            List<Bus> busList = new ArrayList<>();
            busList.add(new Bus(1,3456,"Julio", 10, 80, null));
            busList.add(new Bus(2,3465,"Peter", 12, 70, null));
            busList.add(new Bus(3,3489,"Raymon", 14, 75, null));
            return busList;
        };
        System.out.println(busSupplier.get());

        logger.info("Consumer Interface");
        //Consumer interface that takes a subject and print its title.
        Consumer<Subject> studentConsumer1 = (subject) -> System.out.println(subject.getTitle());
        studentConsumer1.accept(new Subject("CISCO", SubjectUnits.Four));
        getIndentLine();

        logger.info("BiConsumer Interface");
        //BiConsumer interface that takes two double values. The BiConsumer created takes the salary per hour of two professors and returns the difference.
        Professor professorOne = new Professor("Maxwell", 42, true, 3, "Washington", 40.0, 5, 5, "Engineering", 160);
        Professor professorTwo = new Professor("Maxwell", 42, true, 3, "Washington", 55.0, 5, 5, "Computer Science", 160);
        BiConsumer<Double, Double> professorBiConsumer = (salaryOne, salaryTwo ) -> {
            double salaryDifference;
            if(salaryOne > salaryTwo){
                System.out.println(salaryDifference = salaryOne - salaryTwo);
            }else {
                System.out.println(salaryDifference = salaryTwo - salaryOne);
            }
        };
        professorBiConsumer.accept(professorOne.getSalaryPerHr(), professorTwo.getSalaryPerHr());
        getIndentLine();

        //Create 3 custom lambda functions with generics
        //1) Lambda function to filter books that are not borrowed.
        List<Book> newBookList = new ArrayList<>();
        newBookList.add(new Book(1,"Effective Java", "Joshua", BookCategories.TextBook, false));
        newBookList.add(new Book(2,"Think Java", "Morgan", BookCategories.TextBook, true));
        newBookList.add(new Book(3,"Core Java", "Micah", BookCategories.TextBook, true));
        newBookList.add(new Book(4,"Java The legend", "Arthur", BookCategories.TextBook, false));

        //Creation of condition using predicate interface that takes the books that have false isBorrowed property.
        Predicate<Book> bookPredicate = (predicateBookList) -> predicateBookList.getIsBorrowed() == false;
        //Here we are passing the predicate to the filter method then collect and print the result.
        newBookList.stream().filter(bookPredicate).collect(Collectors.toList()).forEach(System.out::println);
        getIndentLine();

        //2)Function that takes Student and return its grade. Another function will take the grade and will return an integer value which is the amount of scholarship
        Student newLambdaStudent = new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.A);
        Function<Student, Grades> function2 = (student) -> student.getGrade();
        Function<Grades, Integer> function3 = (grade) -> grade.getScholarshipAmount();
        int studentGrade = function2.andThen(function3).apply(newLambdaStudent);
        System.out.println(studentGrade);
        getIndentLine();

        //3) Implementation of lambda expression on printing the elements inside the array list using foreach method that takes a consumer.
        List<LabEquipment> labEquipmentList1 = new ArrayList<>();
        labEquipmentList1.add(new LabEquipment(1,"Beaker", 10));
        labEquipmentList1.add(new LabEquipment(2,"Funnel", 7));
        labEquipmentList1.add(new LabEquipment(3,"Erlenmeyer Flask", 8));

        labEquipmentList1.forEach((labEquipment1) -> System.out.println(labEquipment1));

    }
    public static void getIndentLine(){
        System.out.println("----------------------");
    }
}
