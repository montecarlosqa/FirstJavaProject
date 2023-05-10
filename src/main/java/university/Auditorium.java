package university;

import exceptions.BookSeatsException;
import java.util.Objects;

public final class Auditorium implements Accessible {
    public static final int TOTAL_SEATS = 250;
    private int availableSeats;
    private String eventName;

    public Auditorium(String eventName) {
        this.eventName = eventName;
        this.availableSeats = TOTAL_SEATS;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public boolean bookSeats(int seats) throws BookSeatsException {
        if (seats > 0 && seats <= this.availableSeats) {
            this.availableSeats -= seats;
            return true;
        }
        throw new BookSeatsException("The auditorium is fully booked.");
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
        return availableSeats == that.availableSeats && Objects.equals(getEventName(), that.getEventName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableSeats, getEventName());
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "availableSeats=" + availableSeats +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
