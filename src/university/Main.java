package university;

public class Main {

    public static void main(String[] args) {

        School school = new School("Angeles University Foundation", "Angeles City, Philippines");
        System.out.println(school);
        school.isSchoolOpen(true);
        System.out.println("------------------------------");
        Bus bus = new Bus(1, 1, "john wick", 5, 50);
        System.out.println(bus);
        System.out.println("------------------------------");
        Student student = new Student(1, "Science", 50, 5, "Luis", "California","San agustin",5);
        System.out.println(student);
        System.out.println("------------------------------");
        Classroom classroom = new Classroom(3,"Math classroom",50);
        System.out.println(classroom);
        System.out.println("------------------------------");
        Professor professor = new Professor(5,"Jason","California",35.0, 1,1,"Psychology",160);
        System.out.println(professor);
        System.out.println(professor.calculateSalary());
        System.out.println("------------------------------");
        SupportStaff staff = new SupportStaff(5, "Jason", "California", 23.50,1,1,"Sociology",160);
        System.out.println(staff);
        System.out.println(staff.calculateSalary());
        System.out.println("------------------------------");
        Auditorium auditorium = new Auditorium(50, 40, "Lion king");
        System.out.println(auditorium);
        System.out.println("------------------------------");
        Lab lab = new Lab(1,5,"Science Lab",6);
        lab.isOccupied(true);
        System.out.println(lab);
        LabEquipments labEquipments = new LabEquipments(5,1,"Computer lab", 5, 7000);
        System.out.println(labEquipments);
        System.out.println("------------------------------");
        Professor prof1 = new Professor(5,"Alfred","California",35.0, 1,1,"Psychology",160);
        Professor prof2 = new Professor(5,"Alfred","California",35.0, 1,1,"Psychology",160);
        Professor prof3 = new Professor(10,"Bruce","Nevada",35.0, 1,1,"Criminal Justice",160);
        System.out.println(prof1.equals(prof2));
        System.out.println(prof1.equals(prof3));
        System.out.println("Prof1: " + prof1.hashCode() + ", prof2: " + prof2.hashCode() + ", prof3: " + prof3.hashCode());
        System.out.println("------------------------------");
        SupportStaff staff1 = new SupportStaff(8,"Clark", "Utah", 21.0, 6,5,"Equipment cleaner",160);
        SupportStaff staff2 = new SupportStaff(8,"Clark", "Utah", 21.0, 6,5,"Equipment cleaner",160);
        SupportStaff staff3 = new SupportStaff(16,"Paolo", "New york", 21.0, 6,16,"Janitor",160);
        System.out.println(staff1.equals(staff2));
        System.out.println(staff1.equals(staff3));
        System.out.println("staff1: " + staff1.hashCode() + ", staff2: " + staff2.hashCode() + ", staff3: " + staff3.hashCode());
        System.out.println("------------------------------");
        Student stud1 = new Student(2,"Science",45,3,"Jim","New mexico","Claire",6);
        Student stud2 = new Student(2,"Science",45,3,"Jim","New mexico","Claire",6);
        Student stud3 = new Student(4,"Software testing",45,3,"Barbara","Washington","Dominic",6);
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1.equals(stud3));
        System.out.println("stud1: " + stud1.hashCode() + ", stud2: " + stud2.hashCode() + ", stud3: " + stud3.hashCode());

    }
}
