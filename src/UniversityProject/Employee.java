package UniversityProject;

public abstract class Employee {

    private int employeeId;
    private String employeeName;

    private String address;
    private int salary;
    private int departmentId;

    public Employee(int employeeId, String employeeName, String address, int salary, int departmentId){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.salary = salary;
        this.departmentId = departmentId;
    };

    public void setEmployeeId(){
        this.employeeId = employeeId;
    };
    public void setEmployeeName(){
        this.employeeName = employeeName;
    };

    public void setAddress(){
        this.address = address;
    };
    public void setEmployeeSalary(){
        this.salary = salary;
    };
    public void setDepartmentId(){
        this.departmentId = departmentId;
    };
    public int getEmployeeId(){
        return employeeId;
    };
    public String getEmployeeName(){
        return employeeName;
    };

    public String getAddress(){
        return address;
    };
    public int getEmployeeSalary(){
        return salary;
    };
    public int getDepartmentId(){
        return departmentId;
    };

    public abstract String toString();


}
