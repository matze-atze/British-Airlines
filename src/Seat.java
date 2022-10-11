public class Seat {
    private enum SeatClass {
        FIRST, BUSINESS, ECONOMY
    }

    private SeatClass location;
    private char seat;
    private int row;
    private Passenger reserver;


    public Seat(char seat, int row, SeatClass location) {
        this.seat = seat;
        this.row = row;
        this.location = location;
    }

    public SeatClass getLocation(){
        return this.location;
    }
    public char getSeat() {
        return seat;
    }

    public int getRow() {
        return row;
    }


    public void setLocation(SeatClass location){
        this.location = location;
    }
    public void setSeat(char seat) {
        this.seat = seat;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void reserve(Passenger passenger) {
        reserver = passenger;
    }

    public String toString() {
        return getClass().getSimpleName() + " " + seat + " " + row;
    }
}
