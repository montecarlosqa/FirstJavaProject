package university;

import java.util.Objects;

public class Student extends Classroom {

    private int studentId;
    private String studentName;
    private String address;
    private String section;
    private int busId;

    public Student(int classId, String className, int studentCount, int studentId, String studentName, String address, String section, int busId) {
        super(classId, className, studentCount);
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.section = section;
        this.busId = busId;
    };

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    };

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    };

    public void setStudentAddress(String address) {
        this.address = address;
    };

    public void setSection(String section) {
        this.section = section;
    };

    public void setBusId(int busId) {
        this.busId = busId;
    };

    public int getStudentId() {
        return studentId;
    };

    public String getStudentName() {
        return studentName;
    };

    public String getStudentAddress() {
        return address;
    };

    public String getSection() {
        return section;
    };

    public int getBusId() {
        return busId;
    };

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", section='" + section + '\'' +
                ", busId=" + busId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() && getBusId() == student.getBusId() && Objects.equals(getStudentName(), student.getStudentName()) &&
                Objects.equals(address, student.address) && Objects.equals(getSection(), student.getSection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), getStudentName(), address, getSection(), getBusId());
    }
}
