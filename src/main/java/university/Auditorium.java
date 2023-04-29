package university;

import exceptions.OccupiedSeatsException;

import java.util.Objects;

public final class Auditorium implements Accessible {
    public static final int TOTAL_SEATS = 250;
    private int occupiedSeats;
    private String eventName;

    public Auditorium(int occupiedSeats, String eventName) throws OccupiedSeatsException{
        if (occupiedSeats > TOTAL_SEATS || occupiedSeats < 0){
            throw new OccupiedSeatsException("Occupied seats must be within the total seats.");
        }else {
            this.occupiedSeats = occupiedSeats;
        }
        this.eventName = eventName;
    }

    public void setOccupiedSeats(int occupiedSeats) throws OccupiedSeatsException{
        if (occupiedSeats > TOTAL_SEATS || occupiedSeats < 0){
            throw new OccupiedSeatsException("Occupied seats must be within the total seats.");
        }else {
            this.occupiedSeats = occupiedSeats;
        }
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getOccupiedSeats() {
        return occupiedSeats;
    }

    public String getEventName() {
        return eventName;
    }

    public void bookAuditorium(){

    }


    @Override
    public void access(){
        System.out.println("Auditorium is accessible");
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "TOTAL_SEATS=" + TOTAL_SEATS +
                ", occupiedSeats=" + occupiedSeats +
                ", eventName='" + eventName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auditorium)) return false;
        Auditorium that = (Auditorium) o;
        return TOTAL_SEATS == that.TOTAL_SEATS && getOccupiedSeats() == that.getOccupiedSeats() && Objects.equals(getEventName(), that.getEventName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(TOTAL_SEATS, getOccupiedSeats(), getEventName());
    }
}
