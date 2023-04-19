package UniversityProject;

public class Main {

    public static void main(String[] args) {

        School school = new School("Angeles University Foundation", "Angeles City, Philippines");
        System.out.println(school);
        school.isOpen(true);
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
        Professor professor = new Professor(1, "Carlo", "California", 46000, 5, 1,"Computer Science");
        System.out.println(professor);
        System.out.println("------------------------------");
        SupportStaff staff = new SupportStaff(5, "Alyssa", "Nevada", 37000, 5,5, "Equipment Cleaner");
        System.out.println(staff);
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

    }
}
