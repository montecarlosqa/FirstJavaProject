package university;

import exceptions.BorrowedBookException;

import java.util.List;
import java.util.Objects;

public class Student extends Person implements Trainable {
    private int studentId;
    private String address;
    private String section;
    private int busId;
    private List<Class> classes;

    public Student(String name, int age, boolean isMale, int studentId, String address, String section, int busId, List<Class> classes) {
        super(name, age, isMale);
        this.studentId = studentId;
        this.address = address;
        this.section = section;
        this.busId = busId;
        this.classes = classes;
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

    public void setClasses(List<Class> classes){
        this.classes = classes;
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

    public List<Class> getClasses(){
        return classes;
    }

    @Override
    public void train(){
        System.out.println(getName()+ " is being trained");
    }

    public void borrowBook(Book book) throws BorrowedBookException{
        if(book.getIsBorrowed()){
            throw new BorrowedBookException();
        }else{
            System.out.println(getName() + " has borrowed the book " + book.getTitle());
        }
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
