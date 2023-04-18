package OOPAssignment1;

public class ITstudent extends Student{

    private String programmingLanguage;


    public ITstudent(){
        super();
    };

    public ITstudent(int id, String name, String address, boolean isEnrolled, String programmingLanguage){
        super(id, name, address, isEnrolled);
        this.programmingLanguage = programmingLanguage;
    };

    @Override
    public String toString(){
        return "IT student{"+ super.toString() + ", Expertise: " + programmingLanguage + "'}'";
    };

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    };

    public String getProgrammingLanguage(){
        return programmingLanguage;
    };
}
