package university;

import enums.*;
import exceptions.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws BookSeatsException, LabCostsException, NegativeHoursException, IllegalAccessException, NoSuchMethodException {

//        //BookSeatsException will be thrown if we booked less than 0, or more than the available seats.
//        Auditorium auditorium1 = new Auditorium("Lion king");
//        System.out.println(auditorium1.bookSeats(220));
//        //costs cannot be less than 0
//        LabEquipment labEquipment = new LabEquipment(5,"Beaker",1);
//        //working hours cannot be less than 0.
//        Professor professor1 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Computer Science", 160);
//        getIndentLine();
//        //If the salary per hour is negative, the calculate salary method will return negative value and throw the CalculateSalaryException
//        try{
//            Professor prof = new Professor("James",60,true,30,"Ohio",-1,7,25,"Computer Science", 5);
//            System.out.println(prof.calculateSalary(Compensation.Yearly));
//        }catch (CalculateSalaryException cse){
//            logger.error("Salary cannot be negative");
//        }
//        getIndentLine();
//        //if isBorrowed property from Book object is true, custom exception is thrown if borrowBook method from student class is invoked,
//        try{
//            Book book = new Book(3,"Alchemist", "Paulo", BookCategories.Novel,false);
//            Student student = new Student("carlo", 23, true, 6,"california", "st.claire", 7, null, Sports.BASKETBALL, Grades.A);
//            student.borrowBook(book);
//        }catch (BorrowedBookException bce){
//            logger.error("This book is already borrowed");
//        }
////        getIndentLine();
////        //using scanner as a resource
////        try(Scanner in = new Scanner(System.in)){
////            System.out.print("Enter a double: ");
////            double number = in.nextDouble();
////            System.out.printf("You've entered: %.1f\n", number);
////        }
//        getIndentLine();
//        //creating book objects to insert in a list
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(new Book(1,"Batman","Paulo", BookCategories.Novel,true));
//        bookList.add(new Book(2,"Superman","Steven", BookCategories.Novel,false));
//        //creating library object that takes a list of books.
//        Library library = new Library(1,10,50, bookList);
//        List<Book> libraryBooks = library.getBooks();
//        System.out.println(libraryBooks);
//        getIndentLine();
//        //creating class objects to insert in a class list
//        List<Subject> subjectList = new ArrayList<>();
//        subjectList.add(new Subject("Stats10",  SubjectUnits.Four));
//        subjectList.add(new Subject("ECON103",  SubjectUnits.Five));
//        //creating student object that takes a list of classes
//        Student student1 = new Student("Pedro", 21, true, 3,"California", "St. John", 3, subjectList, Sports.BASEBALL, Grades.C);
//        List<Subject> studentSubjectList = student1.getSubjects();
//        System.out.println(studentSubjectList);
//        getIndentLine();
//        //creating student objects to insert in a student list
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Carlo",16,true,3456,"California","St.claire",5, null, Sports.TRACK_AND_FIELD, Grades.B));
//        studentList.add(new Student("Xavier",16,true,3478,"California","St.claire",5, null, Sports.SWIMMING, Grades.D));
//         //creating bus object that takes a list of students.
//        Bus bus = new Bus(5,123,"Miguel",3,50,studentList);
//        List<Student> busStudentList = bus.getStudents();
//        System.out.println(busStudentList);
//        getIndentLine();
//        //creating classroom object that takes a list of students.
//        Classroom classroom = new Classroom(1,"Math class",50,studentList);
//        List<Student> classroomStudentList = classroom.getStudents();
//        System.out.println(classroomStudentList);
//        getIndentLine();
//        //creating lab equipment objects to insert in a lab equipment list
//        List<LabEquipment> labEquipmentList = new ArrayList<>();
//        labEquipmentList.add(new LabEquipment(1,"Test tube", 10));
//        labEquipmentList.add(new LabEquipment(2,"Flash",8));
//        //creating lab object that takes a list of lab equipments
//        Lab lab = new Lab(3, 4, "Science lab", labEquipmentList);
//        List<LabEquipment> laboratoryLabEquipmentList = lab.getLabEquipment();
//        System.out.println(laboratoryLabEquipmentList);
//        getIndentLine();
//        //Custom Generic LinkedList for borrowed books
//        GenericLinkedList<Book> borrowedBooks = new GenericLinkedList();
//        borrowedBooks.addFirst(new Book(1,"Java for dummies", "Steve Nolan", BookCategories.TextBook,true));
//        borrowedBooks.addLast(new Book(1,"Intermediate Python", "Mosh Gupta", BookCategories.TextBook, true));
//        borrowedBooks.add(2, new Book(1,"Fundamentals of programming", "Lilibeth Kruger", BookCategories.TextBook,true));
//        borrowedBooks.print();
//        getIndentLine();

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
        SupportStaff staff = new SupportStaff("max",35,true,2,"California", 20,44,4,"Janitor,",40);
        try{
            System.out.println(staff.calculateSalary(Compensation.Weekly));
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
        getIndentLine();
        logger.info("Predicate Interface");
        //Creation of auditorium object to check if the seats are fully booked or not.
        Auditorium newAuditorium = new Auditorium("Grease");
        newAuditorium.bookSeats(220);
        newAuditorium.bookSeats(20);
        Predicate<Auditorium> auditoriumPredicate = (auditorium) -> {
            if(auditorium.getAvailableSeats() > 0 || auditorium.getAvailableSeats() <= 250){
                return true;
            }else {
                return false;
            }
        };
        System.out.println("Is auditorium still bookable?: " + auditoriumPredicate.test(newAuditorium));
        getIndentLine();
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
        getIndentLine();
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
        //1) Lambda function to filter students who are scholars with grades that are not E or F.
        List<Student> scholarStudents = new ArrayList<>();
        scholarStudents.add(new Student("Xavier",19,true,3478,"California","St.claire",5, null, Sports.TENNIS, Grades.A));
        scholarStudents.add(new Student("Richard",18,true,3467,"California","St.claire",5, null, Sports.TENNIS, Grades.B));
        scholarStudents.add(new Student("Nathan",19,true,3568,"California","St.claire",5, null, Sports.TENNIS, Grades.E));
        scholarStudents.add(new Student("Pablo",120,true,3897,"California","St.claire",5, null, Sports.TENNIS, Grades.F));

        //Creation of condition using predicate interface that takes the students with no Grade E or F.
        Predicate<Student> studetPredicate = (scholarStudentsList) -> scholarStudentsList.getGrade() != Grades.F && scholarStudentsList.getGrade() != Grades.E;
        //Here we are passing the predicate to the filter method then collect and print the result.
        scholarStudents.stream().filter(studetPredicate).collect(Collectors.toList()).forEach(System.out::println);
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
        labEquipmentList1.add(new LabEquipment(1,"Beaker", 10));
        labEquipmentList1.add(new LabEquipment(3,"Erlenmeyer Flask", 8));

        labEquipmentList1.forEach((labEquipment1) -> System.out.println(labEquipment1));
        getIndentLine();

        //Add 7 collection streaming in the hierarchy with terminal and non-terminal operations.
        getIndentLine();

        List<Student> newStudentList = new ArrayList<>();
        newStudentList.add(new Student("Carlo",19,true,3456,"Los Angeles","St.claire",5, null, Sports.TRACK_AND_FIELD, Grades.A));
        newStudentList.add(new Student("James",20,true,3478,"San francisco","St.claire",5, null, Sports.SWIMMING, Grades.A));
        newStudentList.add(new Student("Alexander",20,true,3456,"Fresno","St.claire",9, null, Sports.TRACK_AND_FIELD, Grades.C));
        newStudentList.add(new Student("Louise",21,false,3478,"Oakland","St.claire",9, null, Sports.TENNIS, Grades.C));
        newStudentList.add(new Student("Michael",19,true,3423,"Bakersfield","St.claire",0, null, Sports.VOLLEYBALL, Grades.B));
        newStudentList.add(new Student("Diana",23,false,3413,"Beverly hills","St.claire",0, null, Sports.BASKETBALL, Grades.E));
        newStudentList.add(new Student("Daniel",22,true,3498,"Anaheim","St.claire",4, null, Sports.TENNIS, Grades.F));
        newStudentList.add(new Student("Rachelle",20,false,3454,"Huntington beach","St.claire",4, null, Sports.SWIMMING, Grades.B));
        Classroom classroomStudents = new Classroom(1,"Computer Science",8, newStudentList);

        classroomStudents.getStudents().forEach(System.out::println);
        getIndentLine();

        //Female students using non-terminal filter and terminal collect.
        List<Student> femaleStudentsList = newStudentList.stream()
                .filter(gender -> gender.isMale() == false)
                .collect(Collectors.toList());
        System.out.println("Female students: " + femaleStudentsList);
        getIndentLine();

        //Getting the list of scholar students by using non-terminal filter and non-terminal map.
        List<String> scholarStudentList = newStudentList.stream()
                .filter(scholar -> scholar.getGrade() != Grades.F && scholar.getGrade() != Grades.E)
                .map(scholar -> scholar.getName()).collect(Collectors.toList());
        System.out.println("Scholar Students:" + scholarStudentList);
        getIndentLine();

        //Counting the numbers of scholars in the classroom using terminal count.
        System.out.println("Number of scholars: " + newStudentList.stream()
                .filter(scholar -> scholar.getGrade() != Grades.F && scholar.getGrade() != Grades.E)
                .count());
        getIndentLine();

        //Getting a student that lives in the city of anaheim using anyMatch method.
        System.out.println("Anaheim resident: " + newStudentList.stream()
                .anyMatch(student -> student.getStudentAddress() == "Anaheim"));
        getIndentLine();

        //Getting the first student in the list using findFirst method.
        System.out.println("First student: " + newStudentList.stream()
                .findFirst().get());
        getIndentLine();

        //Getting the oldest student in list using max method.
        Optional<Student> max = newStudentList.stream()
                .max((s1, s2) -> s1.getAge() - s2.getAge());
        if (max.isPresent()) {
            Student oldestStudent = max.get();
            System.out.println("The oldest student is: "
                    + oldestStudent.getName() + " (" + oldestStudent.getAge() + ")");
        }
        getIndentLine();

        //checking if there is a student whose sports is football using noneMatch method.
        boolean noFootballPlayer = newStudentList.stream()
                .noneMatch(student -> student.getSport() == Sports.FOOTBALL);

        System.out.println("Is no one a football player? " + noFootballPlayer);

        System.out.println("------------------------------------------------------");
        System.out.println("Create object and call method using the only reflection");
        System.out.println("------------------------------------------------------");

        Student student = new Student("Sadie",21,false,3498,"Hawkins","St.claire",4, null, Sports.TENNIS, Grades.B);
        Class studentClass = student.getClass();

        //Getting the class name
        String className = studentClass.getName();
        System.out.println("Class name: " + className);
        getIndentLine();

        //Getting the class modifier
        int studentModifier = studentClass.getModifiers();
        String studentModifierName = Modifier.toString(studentModifier);
        System.out.println("Student class name and modifier: " + studentModifierName + " (" + studentModifier + ")");
        getIndentLine();

        //Getting the superclass of student class
        Class superClassOfStudent = studentClass.getSuperclass();
        System.out.println("Super class: " + superClassOfStudent.getName());
        getIndentLine();

        //Get all methods from student class.
        Method[] studentClassMethods = studentClass.getDeclaredMethods();
        System.out.println("Methods:");
        //Iterate each method and print their name, modifier name, and return type.
        for (Method method: studentClassMethods) {
            //print method name.
            System.out.println("Name: " + method.getName());
            //Convert modifier to string and print.
            String modifierName = Modifier.toString(method.getModifiers());
            System.out.println("Modifier: " + modifierName);
            //print return type.
            System.out.println("Return type: " + method.getReturnType());
            getIndentLine();
        }
        getIndentLine();

        //Get all fields from the student class
        Field[] studentClassFields = studentClass.getDeclaredFields();
        System.out.println("Fields:");
        //Iterate each field and print their name, modifier name, and return type.
        for (Field field: studentClassFields) {
            //print name.
            System.out.println("Name: " + field.getName());
            //print type.
            System.out.println("Type: " + field.getType());
            //Convert modifier to string and print.
            String modifierName = Modifier.toString(field.getModifiers());
            System.out.println("Modifier: " + modifierName);
            getIndentLine();
        }

        //Changing the value of private field address using reflection.
        for (Field field: studentClassFields) {
            //Obtain the address field from the array of fields.
            if(field.getName().equals("address")){
                //Making the field accessible.
                field.setAccessible(true);
                //Setting a new value for the field.
                field.set(student, "Bakersfield");
            }
        }
        System.out.println("New address: " + student.getStudentAddress());
        getIndentLine();

        //Getting the constructors from the student class.
        Constructor[] studentConstructor = studentClass.getDeclaredConstructors();


        for (Constructor constructor: studentConstructor) {
            //Get name of the parameter
            System.out.println("Name: " + constructor.getName());
            String modifier = Modifier.toString(constructor.getModifiers());
            System.out.println("Modifier: " + modifier);
            System.out.println("Parameters: " + constructor.getParameterCount());
        }
    }


    public static void getIndentLine(){
        System.out.println("----------------------");
    }
}
