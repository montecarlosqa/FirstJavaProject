package university;

import enums.Grades;
import enums.Sports;
import exceptions.BorrowedBookException;

import java.util.List;
import java.util.Objects;

public class Student extends Person implements Trainable {
    private int studentId;
    private String address;
    private String section;
    private int busId;
    private List<Subject> subjects;
    private Sports sport;
    private Grades grade;

    public Student(String name, int age, boolean isMale, int studentId, String address, String section, int busId, List<Subject> subjects, Sports sport, Grades grade) {
        super(name, age, isMale);
        this.studentId = studentId;
        this.address = address;
        this.section = section;
        this.busId = busId;
        this.subjects = subjects;
        this.sport = sport;
        this.grade = grade;
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

    public void setClasses(List<Subject> subjects){
        this.subjects = subjects;
    }

    public void setSport(Sports sport){
        this.sport = sport;
    }

    public void setGrade(Grades grade){
        this.grade = grade;
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

    public List<Subject> getSubjects(){
        return subjects;
    }

    public Sports getSport(){
        return sport;
    }

    public Grades getGrade(){
        return grade;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId() == student.getStudentId() && getBusId() == student.getBusId() && Objects.equals(address, student.address) && Objects.equals(getSection(), student.getSection()) && Objects.equals(subjects, student.subjects) && getSport() == student.getSport() && getGrade() == student.getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), address, getSection(), getBusId(), subjects, getSport(), getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", address='" + address + '\'' +
                ", section='" + section + '\'' +
                ", busId=" + busId +
                ", subjects=" + subjects +
                ", sport=" + sport +
                ", grade=" + grade +
                '}';
    }
}
