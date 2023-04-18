package OOPAssignment1;

public class Employee extends Person{

    protected double salary;

    public Employee(){
        super();
    };

    public Employee(int id, String name, String address, double salary){
        super(id, name, address);
        this.salary = salary;
    };

    @Override
    public String toString(){
        return "Employee "+ super.toString() + ", Salary: " + salary + " ";
    };

    public void setSalary(double salary){
        this.salary = salary;
    };

    public double getSalary(){
        return salary;
    };
}
