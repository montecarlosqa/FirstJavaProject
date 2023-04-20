package UniversityProject;

import java.util.Objects;

public class SupportStaff extends Employee{

    private int staffId;
    private String title;
    private double workingHours;

    public SupportStaff(int employeeId, String employeeName, String address, double salaryPerHr, int departmentId, int staffId, String title, double workingHours){
        super(employeeId, employeeName, address, salaryPerHr, departmentId);
        this.staffId = staffId;
        this.title = title;
        this.workingHours = workingHours;
    };


    public void setStaffId(int staffId){
        this.staffId = staffId;
    };
    public void setTitle(String title){
        this.title = title;
    };
    public void setWorkingHours(double workingHours){
        this.workingHours = workingHours;
    };
    public int getStaffId(){
        return staffId;
    };
    public String getTitle(){
        return title;
    };
    public double getWorkingHours(){return workingHours;};

    @Override
    public double calculateSalary(){
        return getSalaryPerHr() * workingHours;
    };


    @Override
    public String toString() {
        return "SupportStaff{" +
                "staffId=" + staffId +
                ", title='" + title + '\'' +
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
