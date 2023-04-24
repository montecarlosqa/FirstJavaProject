package university;

public class Classroom implements Accessible {
    private int classId;
    private String className;
    private int studentCount;

    public Classroom(int classId, String className, int studentCount){
        this.classId = classId;
        this.className = className;
        this.studentCount = studentCount;
    }

    public void setClassId(int classId){
        this.classId = classId;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void setStudentCount(int studentCount){
        this.studentCount = studentCount;
    }

    public int getClassId(){
        return classId;
    }

    public String getClassName(){
        return className;
    }

    public int getStudentCount(){
        return studentCount;
    }

    @Override
    public void access(){
        System.out.println(className + " is accessible");
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}
