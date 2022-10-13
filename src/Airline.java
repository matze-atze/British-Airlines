import java.math.BigInteger;
import java.util.*;

/**
 * 
 * @author Ebert Marcel (mebert1)
 */
public class Airline
{
    private ArrayList<Flight> offer;
    private ArrayList<Pilot> employee;
    private String name;
    private String IATAcode;

    public Airline(String name, String IATAcode)
    {
        this.name = name;
        this.IATAcode = IATAcode;
        System.out.println(toString() + " created");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Flight> getOffer() {
        return offer;
    }

    public ArrayList<Pilot> getEmployee() {
        return employee;
    }

    public String getIATAcode() {
        return IATAcode;
    }

    public void setOffer(ArrayList<Flight> offer) {
        this.offer = offer;
    }

    public void setEmployee(ArrayList<Pilot> employee) {
        this.employee = employee;
    }

    public void addAngebote(Flight offer) {
        this.offer.add(offer);
    }

    public void addArbeitNehmer(Pilot employee) {
        employee.hire(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+ IATAcode;
    }

    public static void main(String[] args) {
        //TODO richtige Zeiten Angeben

        // creating the Date of the first flights departure
        GregorianCalendar toDepartureCalendar = new GregorianCalendar();
        toDepartureCalendar.set(2022, 6, 8);
        Date toDepartureDate = java.util.Date.from(toDepartureCalendar.toZonedDateTime().toInstant());

        // creating the Date of the first flights arrival
        GregorianCalendar toArrivalCalendar = new GregorianCalendar();
        toArrivalCalendar.set(2022, 6, 8);
        Date toArrivalDate = java.util.Date.from(toArrivalCalendar.toZonedDateTime().toInstant());

        // creating the Date of the second flights departure
        GregorianCalendar fromDepartureCalender = new GregorianCalendar();
        fromDepartureCalender.set(2022, 6, 11);
        Date fromDepartureDate = java.util.Date.from(fromDepartureCalender.toZonedDateTime().toInstant());

        // creating the Date of the second flights departure
        GregorianCalendar fromArrivalCallender = new GregorianCalendar();
        fromArrivalCallender.set(2022, 6, 11);
        Date fromArrivalDate = java.util.Date.from(fromArrivalCallender.toZonedDateTime().toInstant());


        // Creating the Seats
        Seat toSeat1 = new Seat('A', 16, Seat.SeatClass.BUSINESS);
        Seat toSeat2 = new Seat('B', 16, Seat.SeatClass.BUSINESS);
        Seat fromSeat = toSeat1;

        // creating the 2 Pilots
        Pilot captain = buildCaptain();
        Pilot copilot = buildCopilot();

        // creating the 2 Cities
        City frankfurt = new City("Frankfurt (Main)");
        City newYork = new City("New York");

        // creating the Boarding Card
        BoardingCard cardToNy = new BoardingCard(new BigInteger("502675128554624"),"65 18:50 5D D", toArrivalDate);

        // creating the start Airport
        City[] singletonFlight = {frankfurt, newYork};

        // creating the Airport
        Airport frankfurtAirport = new Airport("Frankfurt", "FRA", frankfurt, singletonFlight, null);
        Airport newYorkAirport = new Airport("LaGuardia", "LGA", newYork, new City[]{newYork}, null);

        // creating the Plane
        Plane A320 = new Plane("A320", "10000", 0.0F, "D-ABZI");

        // creating the Passengers
        Passenger passenger1 = buildPassenger1();
        Passenger passenger2 = new Passenger("HerrmannAMr");


        Flight toNewYork = new Flight(toDepartureDate, toArrivalDate,"LH400_20220608", frankfurtAirport,
                newYorkAirport, A320, new Pilot[]{captain, copilot}, new BoardingCard[] {cardToNy},
                new Passenger[]{passenger1, passenger2}, captain);
        toNewYork.setCoPilot(copilot);
    }
    private static Passenger buildPassenger1() {
        return new Passenger("DillmannNMr");
    }
    private static Pilot buildCaptain(){
       return new Pilot("HermannAMr");
    }
    private static Pilot buildCopilot(){
        return new Pilot("John Whitetaker");
    }
}

