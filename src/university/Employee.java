package university;

import java.util.Objects;

public abstract class Employee {

    protected int employeeId;
    protected String employeeName;
    protected String address;
    protected double salaryPerHr;
    protected int departmentId;

    public Employee(int employeeId, String employeeName, String address, double salaryPerHr, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.address = address;
        this.salaryPerHr = salaryPerHr;
        this.departmentId = departmentId;
    };

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    };

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    };

    public void setAddress(String address) {
        this.address = address;
    };

    public void setSalaryPerHr(double salaryPerHr) {
        this.salaryPerHr = salaryPerHr;
    };

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    };

    public int getEmployeeId() {
        return employeeId;
    };

    public String getEmployeeName() {
        return employeeName;
    };

    public String getAddress() {
        return address;
    };

    public double getSalaryPerHr(){
        return salaryPerHr;
    };

    public int getDepartmentId() {
        return departmentId;
    };

    protected abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", address='" + address + '\'' +
                ", salaryPerHr=" + salaryPerHr +
                ", departmentId=" + departmentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() && Double.compare(employee.getSalaryPerHr(), getSalaryPerHr()) == 0 && getDepartmentId() == employee.getDepartmentId() &&
                Objects.equals(getEmployeeName(), employee.getEmployeeName()) && Objects.equals(getAddress(), employee.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getEmployeeName(), getAddress(), getSalaryPerHr(), getDepartmentId());
    }
}
