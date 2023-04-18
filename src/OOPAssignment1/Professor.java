package OOPAssignment1;

public class Professor extends Employee{

    private String degree;
    public Professor(){
        super();
    };

    public Professor(int id, String name, String address, double salary, String degree){
        super(id, name, address, salary);
        this.degree = degree;
    };

    @Override
    public String toString(){
        return "Professor{"+ super.toString() + ", Degree: " + degree + "'}'";
    };

    public void setDegree(String degree){
        this.degree = degree;
    };

    public String getDegree(){
        return degree;
    };
}
