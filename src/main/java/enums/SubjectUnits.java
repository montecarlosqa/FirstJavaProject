package enums;

public enum SubjectUnits {

    Five(15),
    Four(12),
    Three(9),
    Two(6),
    One(3);
    double hoursPerWeek;
    SubjectUnits(float hoursPerWeek){
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getHoursPerWeek(){
        return hoursPerWeek;
    }
}
