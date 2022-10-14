import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

public class BritishAirwaysBuildUp {

  private static Airline theAirline;
  private static Flight theFlight;
  private static Pilot captain;
  private static Pilot copilot;
  private static Passenger passenger1;
  private static Passenger passenger2;
  private static Seat toSeat1;
  private static Seat toSeat2;
  private static Seat fromSeat;
  private static City city1;
  private static City city2;
  private static Plane thePlane;
  private static BoardingCard cardToNy;
  private static Airport airport1;
  private static Airport airport2;
  
  public static void main(String[] args) {
    //TODO richtige Zeiten Angeben

    // creating the Date of the first flights departure
    GregorianCalendar toDepartureCalendar = new GregorianCalendar();
    toDepartureCalendar.set(2022, 6, 8);
    Date toDepartureDate = Date.from(toDepartureCalendar.toZonedDateTime().toInstant());

    // creating the Date of the first flights arrival
    GregorianCalendar toArrivalCalendar = new GregorianCalendar();
    toArrivalCalendar.set(2022, 6, 8);
    Date toArrivalDate = Date.from(toArrivalCalendar.toZonedDateTime().toInstant());

    // creating the Date of the second flights departure
    GregorianCalendar fromDepartureCalender = new GregorianCalendar();
    fromDepartureCalender.set(2022, 6, 11);
    Date fromDepartureDate = Date.from(fromDepartureCalender.toZonedDateTime().toInstant());

    // creating the Date of the second flights departure
    GregorianCalendar fromArrivalCallender = new GregorianCalendar();
    fromArrivalCallender.set(2022, 6, 11);
    Date fromArrivalDate = Date.from(fromArrivalCallender.toZonedDateTime().toInstant());


    //Creating Flight
    theFlight = new Flight(toDepartureDate, toArrivalDate,"LH400_20220608", airport1,
            airport2, thePlane, new Pilot[]{captain, copilot}, new BoardingCard[] {cardToNy},
            new Passenger[]{passenger1, passenger2}, captain);
    theFlight.setCoPilot(copilot);

    // Creating the Airline
    theAirline = buildAirline();

    // Creating the Seats
    toSeat1 = new Seat('A', 16, Seat.SeatClass.BUSINESS);
    toSeat2 = new Seat('B', 16, Seat.SeatClass.BUSINESS);
    fromSeat = toSeat1;

    // creating the Pilots
    Pilot.show();

    // creating the 2 Cities
    city1 = new City("Frankfurt (Main)");
    city2 = new City("New York");

    // creating the Boarding Card
    cardToNy = new BoardingCard(new BigInteger("502675128554624"),"65 18:50 5D D", toArrivalDate);

    // creating the start Airport
    City[] singletonFlight = {city1, city2};

    // creating the Airport
    airport1 = new Airport("Frankfurt", "FRA", city1, singletonFlight, null);
    airport2 = new Airport("LaGuardia", "LGA", city2, new City[]{city2}, null);

    // creating the Plane
    thePlane = buildPlane();

    // creating the Passengers
    passenger1 = buildPassenger1();
    passenger2 = buildPassenger2();

  }
  private static Airline buildAirline() {
    return new Airline("British Airways", "BA");}
  private static Plane buildPlane() {
    return new Plane("A320", "10000", 0.0F, "D-ABZI");}

  private static Passenger buildPassenger1() {
    return new Passenger("Franz");
  }

  private static Passenger buildPassenger2() {
    return new Passenger("Marie");}




}
