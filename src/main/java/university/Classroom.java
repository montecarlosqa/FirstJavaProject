package university;

import exceptions.LabCostsException;
import exceptions.StudentCountException;

public class Classroom implements Accessible {
    private int classId;
    private String className;
    private int studentCount;

    public Classroom(int classId, String className, int studentCount) throws StudentCountException{
        this.classId = classId;
        this.className = className;
        if(studentCount < 0){
            throw new StudentCountException("Students must be greater than 0.");
        }else{
            this.studentCount = studentCount;
        }
    }

    public void setClassId(int classId){
        this.classId = classId;
    }

    public void setClassName(String className){
        this.className = className;
    }

    public void setStudentCount(int studentCount) throws StudentCountException{
        if(studentCount < 0){
            throw new StudentCountException("Students must be greater than 0.");
        }else{
            this.studentCount = studentCount;
        }
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
