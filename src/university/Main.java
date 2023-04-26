package university;

public class Main {

    public static void main(String[] args) {

        School school = new School("Angeles University Foundation", "Angeles City, Philippines");
        System.out.println(school);
        school.isSchoolOpen(false);
        System.out.println("------------------------------");
        Bus bus = new Bus(1, 1, "John", 5, 50);
        System.out.println(bus);
        System.out.println("------------------------------");
        Student student = new Student("Jobelle",25,false,15,"Georgia","Mark",6);
        System.out.println(student);
        student.train();
        System.out.println("------------------------------");
        Classroom classroom = new Classroom(3,"Math classroom",50);
        System.out.println(classroom);
        classroom.access();
        System.out.println("------------------------------");
        Professor professor = new Professor("Grace",46,false,18,"Ohio",35.0,7,25,"Physical Education", 160);
        System.out.println(professor);
        System.out.println(professor.calculateSalary());
        professor.train();
        professor.takeLeave();
        System.out.println("------------------------------");
        SupportStaff staff = new SupportStaff("Steve",34,true,9,"Virginia",25,10,9,"Equipment cleaner",160);
        System.out.println(staff);
        System.out.println(staff.calculateSalary());
        professor.train();
        System.out.println("------------------------------");
        Auditorium auditorium = new Auditorium(50, "Lion king");
        System.out.println(auditorium);
        auditorium.access();
        System.out.println("------------------------------");
        Lab lab = new Lab(1,5,"Science Lab",6);
        System.out.println(lab);
        LabEquipments labEquipments = new LabEquipments(5,1,"Computer lab", 5, 7000);
        System.out.println(labEquipments);
        lab.access();
        System.out.println("------------------------------");
        Professor prof1 = new Professor("Rosana",59,false,25,"Ohio",35.0,7,25,"Psychology", 160);
        Professor prof2 = new Professor("Rosana",59,false,25,"Ohio",35.0,7,25,"Psychology", 160);
        Professor prof3 = new Professor("James",60,true,30,"Ohio",35.0,7,25,"Sociology", 160);
        System.out.println(prof1.equals(prof2));
        System.out.println(prof1.equals(prof3));
        System.out.println("Prof1: " + prof1.hashCode() + ", prof2: " + prof2.hashCode() + ", prof3: " + prof3.hashCode());
        System.out.println("------------------------------");
        SupportStaff staff1 = new SupportStaff("Hannah",36,false,9,"Missouri",25,10,13,"Equipment cleaner",160);
        SupportStaff staff2 = new SupportStaff("Hannah",36,false,9,"Missouri",25,10,13,"Equipment cleaner",160);
        SupportStaff staff3 = new SupportStaff("Jaime",30,true,15,"Maine",25,10,13,"Janitor",160);
        System.out.println(staff1.equals(staff2));
        System.out.println(staff1.equals(staff3));
        System.out.println("staff1: " + staff1.hashCode() + ", staff2: " + staff2.hashCode() + ", staff3: " + staff3.hashCode());
        System.out.println("------------------------------");
        Student stud1 = new Student("Christien",24,true,5,"New mexico","Claire",6);
        Student stud2 = new Student("Christien",24,true,5,"New mexico","Claire",6);
        Student stud3 = new Student("Tristan",24,true,8,"Texas","Benedict",10);
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1.equals(stud3));
        System.out.println("stud1: " + stud1.hashCode() + ", stud2: " + stud2.hashCode() + ", stud3: " + stud3.hashCode());


    }
}
