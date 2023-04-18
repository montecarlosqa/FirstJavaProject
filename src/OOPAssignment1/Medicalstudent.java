package OOPAssignment1;

public class Medicalstudent extends Student{

    private String field;


    public Medicalstudent(){
        super();
    };

    public Medicalstudent(int id, String name, String address, boolean isEnrolled, String field){
        super(id, name, address, isEnrolled);
        this.field = field;
    };

    @Override
    public String toString(){
        return "Med student{"+ super.toString() + ", Field: " + field + "'}'";
    };

    public void setField(String field){
        this.field = field;;
    };

    public String getField(){
        return field;
    };

}
