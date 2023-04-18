package OOPAssignment1;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(3, "carlo", "California",false);
        System.out.println(student.toString());
        student.setisEnrolled(true);
        System.out.println(student.toString());

        System.out.println("---------------------------------");

        ITstudent iTstudent = new ITstudent(3, "carlo", "California",true, "Python");
        System.out.println(iTstudent.toString());
        iTstudent.setProgrammingLanguage("Java");
        System.out.println(iTstudent.toString());

        Medicalstudent medicalstudent = new Medicalstudent(3, "carlo", "California",true, "Pharmacy");
        System.out.println(medicalstudent.toString());
        medicalstudent.setField("Med Technology");
        System.out.println(medicalstudent.toString());

        System.out.println("---------------------------------");

        Employee employee = new Employee(3, "carlo", "California",36000.0);
        System.out.println(employee.toString());
        employee.setSalary(37500.0);
        System.out.println(employee.toString());

        System.out.println("---------------------------------");

        Professor professor= new Professor(3, "carlo", "California",40000.0, "Master's Degree");
        System.out.println(professor.toString());
        professor.setDegree("Doctorate Degree");
        System.out.println(professor.toString());

        Security security= new Security(3, "John", "California",36000.0, "Watchman");
        System.out.println(security.toString());
        security.setRank("Armed Security Officer");
        System.out.println(security.toString());

        Nurse nurse = new Nurse(3, "John", "California",38000.0, "Pediatric Nurse");
        System.out.println(nurse.toString());
        nurse.setSpecialization("Special education school nurse");
        System.out.println(nurse.toString());

        Cleaner cleaner = new Cleaner(3, "Joseph", "California",36000.0, "Laundry attendant");
        System.out.println(cleaner.toString());
        cleaner.setTitle("Equipment cleaner");
        System.out.println(cleaner.toString());





    }
}
