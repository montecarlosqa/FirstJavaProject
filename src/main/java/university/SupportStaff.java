package university;

import exceptions.NegativeHoursException;

import java.util.Objects;

public class SupportStaff extends Employee {
    private int staffId;
    private String title;
    private double workingHours;

    public SupportStaff(String name, int age, boolean isMale, int employeeId, String address, double salaryPerHr, int departmentId, int staffId, String title, double workingHours) throws NegativeHoursException{
        super(name, age, isMale, employeeId, address, salaryPerHr, departmentId);
        this.staffId = staffId;
        this.title = title;
        if(workingHours < 0){
            throw new NegativeHoursException("Working hours must be greater than 0.");
        }else{
            this.workingHours = workingHours;
        }
    };

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWorkingHours(double workingHours) throws NegativeHoursException{
        if(workingHours < 0){
            throw new NegativeHoursException("Working hours must be greater than 0.");
        }else{
            this.workingHours = workingHours;
        }
    }

    public int getStaffId() {
        return staffId;
    }

    public String getTitle() {
        return title;
    }

    public double getWorkingHours() {
        return workingHours;
    }
    @Override
    public double calculateSalary() {
        return getSalaryPerHr() * workingHours;
    }

    @Override
    public String toString() {
        return "SupportStaff{" +
                "staffId=" + staffId +
                ", title='" + title + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupportStaff)) return false;
        if (!super.equals(o)) return false;
        SupportStaff that = (SupportStaff) o;
        return getStaffId() == that.getStaffId() && Double.compare(that.getWorkingHours(), getWorkingHours()) == 0 && Objects.equals(getTitle(), that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getStaffId(), getTitle(), getWorkingHours());
    }
}
