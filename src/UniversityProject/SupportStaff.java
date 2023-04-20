package UniversityProject;

public class SupportStaff extends Employee{

    private int staffId;
    private String title;

    public SupportStaff(int employeeId, String employeeName, String address, int salary, int departmentId, int staffId, String title){
        super(employeeId, employeeName, address, salary, departmentId);
        this.staffId = staffId;
        this.title = title;
    };


    public void setStaffId(){
        this.staffId = staffId;
    };
    public void setTitle(){
        this.title = title;
    };
    public int getStaffId(){
        return staffId;
    };
    public String title(){
        return title;
    };

    @Override
    public String toString(){
        return "Staff Id: " + staffId + "\nTitle: " + title;
    };
}
