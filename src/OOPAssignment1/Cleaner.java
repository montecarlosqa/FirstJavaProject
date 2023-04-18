package OOPAssignment1;

public class Cleaner extends Employee{

    private String title;
    public Cleaner(){
        super();
    };

    public Cleaner(int id, String name, String address, double salary, String title){
        super(id, name, address, salary);
        this.title = title;
    };

    @Override
    public String toString(){
        return "Cleaner{"+ super.toString() + ", Title: " + title + "'}'";
    };

    public void setTitle(String specialization){
        this.title =specialization;
    };

    public String getTitle(){
        return title;
    };
}
