package university;

import java.util.List;

public class Classroom implements Accessible {
    private int classId;
    private String className;
    private int studentCount;
    private List<Student> students;

    public Classroom(int classId, String className, int studentCount, List<Student> students){
        this.classId = classId;
        this.className = className;
        this.studentCount = studentCount;
        this.students = students;
    }

    public void setClassId(int classId){
        this.classId = classId;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void setStudentCount(int studentCount) {
            this.studentCount = studentCount;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
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

    public List<Student> getStudents(){
        return students;
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
                ", students=" + students +
                '}';
    }
}
