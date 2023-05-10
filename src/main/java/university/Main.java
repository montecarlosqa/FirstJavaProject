package university;

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
import java.util.function.Predicate;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws BookSeatsException, LabCostsException, NegativeHoursException{

        //BookSeatsException will be thrown if we booked less than 0, or more than the available seats.
        Auditorium auditorium1 = new Auditorium("Lion king");
        System.out.println(auditorium1.bookSeats(220));
        System.out.println(auditorium1.bookSeats(60));
        //costs cannot be less than 0
        LabEquipment labEquipment = new LabEquipment(5,"Beaker",1);
        //working hours cannot be less than 0.
        Professor professor1 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
        getIndentLine();
        //custom exception is thrown if salary per hour is less than 0
        try{
            Professor prof = new Professor("James",60,true,30,"Ohio",35,7,25,"Computer Science", 5);
            System.out.println(prof.calculateSalary());
        }catch (CalculateSalaryException cse){
            logger.error("Salary cannot be negative");
        }
        getIndentLine();
        //if isBorrowed property from Book object is true, custom exception is thrown if borrowBook method from student class is invoked,
        try{
            Book book = new Book(3,"Alchemist", "Paulo",false);
            Student student = new Student("carlo", 23, true, 6,"california", "st.claire", 7, null);
            student.borrowBook(book);
        }catch (BorrowedBookException bce){
            logger.error("This book is already borrowed");
        }
        getIndentLine();
        //using scanner as a resource
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter a double: ");
            double number = in.nextDouble();
            System.out.printf("You've entered: %.1f", number);
        }
        getIndentLine();
        //creating book objects to insert in a list
        Book book1 = new Book(1,"Batman","Paulo",true);
        Book book2 = new Book(2,"Superman","Steven",false);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        //creating library object that takes a list of books.
        Library library = new Library(1,10,50, bookList);
        List<Book> libraryBooks = library.getBooks();
        for (Book bk : libraryBooks) {
            System.out.println("Title : " + bk.getTitle() + " and " + "Author : " + bk.getAuthor());
        }
        getIndentLine();
        //creating class objects to insert in a class list
        Subject subject1 = new Subject("Stats10", 5, 15);
        Subject subject2 = new Subject("ECON103", 4, 12);
        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        //creating student object that takes a list of classes
        Student student = new Student("Pedro", 21, true, 3,"California", "St. John", 3, subjectList);
        List<Subject> studentSubjectList = student.getClasses();
        for (Subject cl : studentSubjectList) {
            System.out.println("Name : " + cl.getTitle() + " and " + "Units : " + cl.getUnits());
        }
        getIndentLine();
        //creating student objects to insert in a student list
        Student student1 = new Student("Carlo",16,true,3456,"California","St.claire",5, null);
        Student student2 = new Student("Xavier",16,true,3478,"California","St.claire",5, null);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
         //creating bus object that takes a list of students.
        Bus bus = new Bus(5,123,"Miguel",3,50,studentList);
        List<Student> busStudentList = bus.getStudents();
        for (Student sd : busStudentList) {
            System.out.println("Name : " + sd.getName() + " and " + "Address : " + sd.getStudentAddress());
        }
        getIndentLine();
        //creating classroom object that takes a list of students.
        Classroom classroom = new Classroom(1,"Math class",50,studentList);
        List<Student> classroomStudentList = classroom.getStudents();
        for (Student sd : classroomStudentList) {
           System.out.println("Name : " + sd.getName() + " and " + "Address : " + sd.getStudentAddress());
        }
        getIndentLine();
        //creating lab equipment objects to insert in a lab equipment list
        LabEquipment labEquipment1 = new LabEquipment(1,"Test tube", 10);
        LabEquipment labEquipment2 = new LabEquipment(2,"Flash",8);
        List<LabEquipment> labEquipmentList = new ArrayList<>();
        labEquipmentList.add(labEquipment1);
        labEquipmentList.add(labEquipment2);
        //creating lab object that takes a list of lab equipments
        Lab lab = new Lab(3, 4, "Science lab", labEquipmentList);
        List<LabEquipment> laboratoryLabEquipmentList = lab.getLabEquipment();
        for (LabEquipment labEquip : laboratoryLabEquipmentList) {
            System.out.println("Equipment name : " + labEquip.getEquipmentName() + " and " + "Cost : " + labEquip.getCosts());
        }
        getIndentLine();
        //Custom Generic LinkedList for borrowed books
        GenericLinkedList<Book> borrowedBooks = new GenericLinkedList();
        borrowedBooks.addFirst(new Book(1,"Java for dummies", "Steve Nolan", true));
        borrowedBooks.addLast(new Book(1,"Intermediate Python", "Mosh Gupta", true));
        borrowedBooks.add(2, new Book(1,"Fundamentals of programming", "Lilibeth Kruger", true));
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
    }
    public static void getIndentLine(){
        System.out.println("----------------------");
    }
}
