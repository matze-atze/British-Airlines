public class Seat {
    private char seat;
    private int row;
    private Passenger reserver;

    public Seat(char seat, int row) {
        this.seat = seat;
        this.row = row;
    }

    public char getSeat() {
        return seat;
    }

    public int getRow() {
        return row;
    }

    public void setSeat(char seat) {
        this.seat = seat;
    }

    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return true if successfull
     */
    public void reserve(Passenger passenger) {
        reserver = passenger;
    }
}
