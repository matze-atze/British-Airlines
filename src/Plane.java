/**
* @author Matthias Vollmer
*/

import java.util.HashSet;
import java.util.Set;

public class Plane {
    final private String model;
    final private String serialNumber;
    private float hoursFlown;
    final private String tailNumber;
    private Set<Seat> seats = new HashSet<>(2);


    public Plane(String model, String serialNumber, float hoursFlown, String tailNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.hoursFlown = hoursFlown;
        this.tailNumber = tailNumber;
    }

    public float getHoursFlown() {
        return hoursFlown;
    }

    public String getModel() {
        return model;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    public void addSeats(Seat seat) {
        this.seats.add(seat);
    }

    public void takeOff() {
        System.out.println(toString() + "took off");
    }

    public void reserve(int row, char seat, Passenger passenger) {
        seats.forEach((s)->{
            if (s.getRow() == row || s.getSeat() == seat) {
                s.reserve(passenger);
            }
        });
    }
    public void refuel() {
        System.out.println(toString() + "is refueled");
    }
    public void deIce() {
        System.out.println(toString() + "is de-iced");
    }
}
