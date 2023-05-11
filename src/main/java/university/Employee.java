package university;

import enums.Compensation;
import exceptions.CalculateSalaryException;

import java.util.Objects;

public abstract class Employee extends Person implements Trainable, Payable, Promotable{
    protected int employeeId;
    protected String address;
    protected double salaryPerHr;
    protected int departmentId;

    public Employee(String name, int age, boolean isMale, int employeeId, String address, double salaryPerHr, int departmentId) {
        super(name, age, isMale);
        this.employeeId = employeeId;
        this.address = address;
        this.salaryPerHr = salaryPerHr;
        this.departmentId = departmentId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalaryPerHr(double salaryPerHr) {
        this.salaryPerHr = salaryPerHr;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getAddress() {
        return address;
    }

    public double getSalaryPerHr(){
        return salaryPerHr;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public final void takeLeave(){
        System.out.println(getName() + " is taking a leave");
    }

    protected abstract double calculateSalary(Compensation compensation) throws CalculateSalaryException;

    @Override
    public void train(){
        System.out.println(getName() + " is being trained");
    }

    @Override
    public void pay(){
        System.out.println(getName() + " is getting paid");
    }

    @Override
    public void promote(){
        System.out.println(getName() + " is getting promoted");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
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
        return getEmployeeId() == employee.getEmployeeId() && Double.compare(employee.getSalaryPerHr(), getSalaryPerHr()) == 0 && getDepartmentId() == employee.getDepartmentId() && Objects.equals(getAddress(), employee.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getAddress(), getSalaryPerHr(), getDepartmentId());
    }
}
