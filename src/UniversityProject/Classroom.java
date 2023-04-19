package UniversityProject;

public class Classroom {

    private int classId;
    private String className;
    private int studentCount;

    public Classroom(int classId, String className, int studentCount){
        this.classId = classId;
        this.className = className;
        this.studentCount = studentCount;
    };

    public void setClassId(int classId){
        this.classId = classId;
    };
    public void setClassName(String className){
        this.className = className;
    };
    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    };
    public int getClassId(){
        return classId;
    };
    public String getClassName(){
        return className;
    };
    public int getStudentCount(){
        return studentCount;
    };

    public String toString(){
        return "Class Id; " + classId + "\nClass name: " + className + "\nStudent count: " + studentCount;
    };

}
