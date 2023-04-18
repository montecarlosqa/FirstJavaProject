package OOPAssignment1;

public class Nurse extends Employee{
    private String specialization;
    public Nurse(){
        super();
    };

    public Nurse(int id, String name, String address, double salary, String specialization){
        super(id, name, address, salary);
        this.specialization =specialization;
    };

    @Override
    public String toString(){
        return "Nurse{"+ super.toString() + ", Specialization: " + specialization + "'}'";
    };

    public void setSpecialization(String specialization){
        this.specialization =specialization;
    };

    public String getSpecialization(){
        return specialization;
    };
}
