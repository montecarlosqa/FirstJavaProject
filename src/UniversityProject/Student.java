package UniversityProject;

public class Student extends Classroom{

    private int studentId;
    private String studentName;
    private String address;
    private String section;
    private int busId;

    public Student(int classId, String className, int studentCount, int studentId, String studentName, String address, String section, int busId){
            super(classId, className, studentCount);
            this.studentId = studentId;
            this.studentName = studentName;
            this.address = address;
            this.section = section;
            this.busId = busId;
    };

    public void setStudentId(int studentId){
        this.studentId = studentId;
    };
    public void setStudentName(String studentName){
        this.studentName = studentName;
    };
    public void setStudentAddress(String address){
        this.address = address;
    };
    public void setSection(String section){
        this.section = section;
    };

    public void setBusId(int busId){
        this.busId = busId;
    };
    public int getStudentId(){
        return studentId;
    };
    public String getStudentName(){
        return studentName;
    };
    public String getStudentAddress(){
        return address;
    };
    public String getSection(){
        return section;
    };
    public int getBusId(){
        return busId;
    };

    @Override
    public String toString(){
        return "Student Id: " + studentId + "\nStudent name: " + studentName + "\nAddress: " + address + "\nSection: " + section + "\nBus Id: " + busId ;
    };
}
