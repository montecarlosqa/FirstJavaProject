package enums;

public enum Compensation {

    Yearly(1920),
    Monthly(160),
    Weekly(40);

    double hoursOfWork;
    Compensation(double hoursOfWork){
        this.hoursOfWork = hoursOfWork;
    }

    public double getHoursOfWork(){
        return hoursOfWork;
    }
}
