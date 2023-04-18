package OOPAssignment1;

public class Student extends Person{

    protected boolean isEnrolled;

    public Student(){
        super();
    };

    public Student(int id, String name, String address, boolean isEnrolled){
        super(id, name, address);
        this.isEnrolled = isEnrolled;
    };

    @Override
    public String toString(){
        return super.toString() + ", Enrolled: " + isEnrolled;
    }

    public void setisEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;
    };

    public boolean getisEnrolled(){
        return isEnrolled;
    };

}
