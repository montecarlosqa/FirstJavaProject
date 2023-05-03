package university;

import java.util.List;

public final class Bus {
    private int busId;
    private int driverId;
    private String driverName;
    private int busNumber;
    private int capacity;
    private List<Student> students;

    public Bus(int busId, int driverId, String driverName, int busNumber, int capacity, List<Student> students) {
        this.busId = busId;
        this.driverId = driverId;
        this.driverName = driverName;
        this.busNumber = busNumber;
        this.capacity = capacity;
        this.students = students;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setCapacity(int capacity) {
            this.capacity = capacity;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    public int getBusId() {
        return busId;
    }

    public int driverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busId=" + busId +
                ", driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", busNumber=" + busNumber +
                ", capacity=" + capacity +
                '}';
    }
}
