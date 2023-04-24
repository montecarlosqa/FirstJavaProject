package university;

import java.util.Objects;

public class Professor extends Employee{
    private int professorId;
    private String field;
    private double workingHours;

    public Professor(String name, int age, boolean isMale, int employeeId, String address, double salaryPerHr, int departmentId, int professorId, String field, double workingHours){
        super(name, age, isMale, employeeId, address, salaryPerHr, departmentId);
        this.professorId = professorId;
        this. field = field;
        this.workingHours = workingHours;
    }

    public void setProfessorId(int professorId){
        this.professorId = professorId;
    }

    public void setField(String field){
        this. field = field;
    }

    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    }

    public int getProfessorId(){
        return professorId;
    }

    public String getField(){
        return field;
    }

    public double getWorkingHours(){
        return workingHours;
    }

    @Override
    public double calculateSalary(){
        return getSalaryPerHr() * workingHours;
    };

    @Override
    public void train(){
        System.out.println(getName() + " is being trained");
    };

    @Override
    public String toString() {
        return "Professor{" +
                "professorId=" + professorId +
                ", field='" + field + '\'' +
                ", workingHours=" + workingHours +
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
