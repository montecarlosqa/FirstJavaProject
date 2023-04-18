package OOPAssignment1;

public class Student extends Person{

    protected boolean isEnrolled;
    protected String enrollMessage;

    public Student(){
        super();
    };

    public Student(int id, String name, String address, boolean isEnrolled){
        super(id, name, address);
        this.isEnrolled = isEnrolled;

        if(isEnrolled){
            enrollMessage ="Enrolled";
        }else {
            enrollMessage ="Not Enrolled";
        };
    };

    @Override
    public String toString(){
        return super.toString() + ", " + enrollMessage;
    }

    public void setisEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;

        if(isEnrolled){
            enrollMessage ="Enrolled";
        }else {
            enrollMessage ="Not Enrolled";
        };
    };

    public String getisEnrolled(){
        return enrollMessage;
    };

}
