package university;

import enums.Compensation;
import exceptions.CalculateSalaryException;
import exceptions.LabCostsException;
import exceptions.NegativeHoursException;

import java.util.Objects;

public class Professor extends Employee{
    private int professorId;
    private String field;
    private double workingHours;

    public Professor(String name, int age, boolean isMale, int employeeId, String address, double salaryPerHr, int departmentId, int professorId, String field, double workingHours) throws NegativeHoursException{
        super(name, age, isMale, employeeId, address, salaryPerHr, departmentId);
        this.professorId = professorId;
        this. field = field;
        if(workingHours < 0){
            throw new NegativeHoursException("Working hours must be greater than 0.");
        }else{
            this.workingHours = workingHours;
        }
    }

    public void setProfessorId(int professorId){
        this.professorId = professorId;
    }

    public void setField(String field){
            this. field = field;
    }

    public void setWorkingHours(double workingHours) throws NegativeHoursException{
        if(workingHours < 0){
            throw new NegativeHoursException("Working hours must be greater than 0.");
        }else{
            this.workingHours = workingHours;
        }
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
    public double calculateSalary(Compensation compensation) throws CalculateSalaryException{
        double salary = 0;

        if(compensation == Compensation.Yearly){
            salary = getSalaryPerHr() * compensation.getHoursOfWork();
        } else if (compensation == Compensation.Monthly) {
            salary = getSalaryPerHr() * compensation.getHoursOfWork();
        } else if ((compensation == Compensation.Weekly)) {
            salary = getSalaryPerHr() * compensation.getHoursOfWork();
        }
        if(salary < 0){
            throw new CalculateSalaryException();
        }
        return salary;
    }

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
