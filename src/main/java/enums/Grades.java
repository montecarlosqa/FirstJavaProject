package enums;

public enum Grades {

    A(5000),
    B(4000),
    C(3000),
    D(2000),
    E(0),
    F(0);

    private int scholarshipAmount;
    Grades(int scholarshipAmount){
        this.scholarshipAmount = scholarshipAmount;
    }

    public int getScholarshipAmount() {
        return scholarshipAmount;
    }
}
