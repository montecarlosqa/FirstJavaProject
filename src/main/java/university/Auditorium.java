package university;

import exceptions.OccupiedSeatsException;

import java.util.List;
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


    public int getAvailableSeats(){
        int availableSeats;
        return availableSeats = TOTAL_SEATS - occupiedSeats;
    }

    @Override
    public void access(){
        System.out.println("Auditorium is accessible");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auditorium)) return false;
        Auditorium that = (Auditorium) o;
        return getOccupiedSeats() == that.getOccupiedSeats() && Objects.equals(getEventName(), that.getEventName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOccupiedSeats(), getEventName());
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "occupiedSeats=" + occupiedSeats +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
