package university;

public class Auditorium {

    private int totalSeats;
    private int occupiedSeats;
    private String eventName;

    public Auditorium(int totalSeats, int occupiedSeats, String eventName) {
        this.totalSeats = totalSeats;
        this.occupiedSeats = occupiedSeats;
        this.eventName = eventName;
    };

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    };

    public void setOccupiedSeats(int occupiedSeats) {
        this.occupiedSeats = occupiedSeats;
    };

    public void setEventName(String eventName) {
        this.eventName = eventName;
    };

    public int getTotalSeats() {
        return totalSeats;
    };

    public int getOccupiedSeats() {
        return occupiedSeats;
    };

    public String getEventName() {
        return eventName;
    };

    @Override
    public String toString() {
        return "Auditorium{" +
                "totalSeats=" + totalSeats +
                ", occupiedSeats=" + occupiedSeats +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
