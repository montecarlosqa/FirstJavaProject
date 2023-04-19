package UniversityProject;

public class Professor extends Employee{

    private int professorId;
    private String field;

    public Professor(int employeeId, String employeeName, String address, int salary, int departmentId, int professorId, String field){
        super(employeeId, employeeName, address, salary, departmentId);
        this.professorId = professorId;
        this. field = field;
    };

    public String toString(){
        return "Professor Id: " + professorId + "\nField: " + field;
    };
}
