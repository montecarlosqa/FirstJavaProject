package university;

import java.util.Objects;

public class Student extends Person implements Trainable{
    private int studentId;
    private String address;
    private String section;
    private int busId;

    public Student(String name, int age, boolean isMale, int studentId, String address, String section, int busId) {
        super(name, age, isMale);
        this.studentId = studentId;
        this.address = address;
        this.section = section;
        this.busId = busId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentAddress(String address) {
        this.address = address;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentAddress() {
        return address;
    }

    public String getSection() {
        return section;
    }

    public int getBusId() {
        return busId;
    }

    @Override
    public void train(){
        System.out.println(getName()+ " is being trained");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
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
        return getStudentId() == student.getStudentId() && getBusId() == student.getBusId() && Objects.equals(address, student.address) && Objects.equals(getSection(), student.getSection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), address, getSection(), getBusId());
    }
}
