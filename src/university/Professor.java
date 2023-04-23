package university;

import java.util.Objects;

public class Professor extends Employee{

    private int professorId;
    private String field;
    private double workingHours;

    public Professor(int employeeId, String employeeName, String address, double salaryPerHr, int departmentId, int professorId, String field, double workingHours){
        super(employeeId, employeeName, address, salaryPerHr, departmentId);
        this.professorId = professorId;
        this. field = field;
        this.workingHours = workingHours;
    };

    public void setProfessorId(int professorId){
        this.professorId = professorId;
    };

    public void setField(String field){
        this. field = field;
    };

    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    };

    public int getProfessorId(){
        return professorId;
    };

    public String getField(){
        return field;
    };

    public double getWorkingHours(){
        return workingHours;
    };

    @Override
    public double calculateSalary(){
        return getSalaryPerHr() * workingHours;
    };

    @Override
    public String toString() {
        return "Professor{" +
                "professorId=" + professorId +
                ", field='" + field + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return getProfessorId() == professor.getProfessorId() && Double.compare(professor.getWorkingHours(), getWorkingHours()) == 0 && Objects.equals(getField(), professor.getField());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProfessorId(), getField(), getWorkingHours());
    }
}
