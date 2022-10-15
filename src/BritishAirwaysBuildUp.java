import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Kadir, Matthias, Marcel, Nazanin
 */
public class BritishAirwaysBuildUp {

  private static Airline theAirline;
  private static Flight theFlight;
  private static Pilot theCaptain;
  private static Pilot theCopilot;
  private static Passenger thePassenger1;
  private static Passenger thePassenger2;
  private static BoardingCard theBoardingCard;
  private static Seat toSeat1;
  private static Seat toSeat2;
  private static Seat fromSeat1;
  private static Seat fromSeat2;
  private static City city1;
  private static City city2;
  private static Plane thePlane;
  private static BoardingCard cardToNy;
  private static Airport theAirport1;
  private static Airport theAirport2;

  public static void main(String[] args) {
    //TODO richtige Zeiten Angeben
    //theFlight.delay(new Date());

    // creating the Passengers
    buildPassenger1();
    buildPassenger2();

    // creating the Pilots
    buildCaptain();
    buildCopilot();

    //Creating Flight
    buildFlight();

    // Creating the Airline
    buildAirline();

    theFlight.setProvider(theAirline);

    // creating the 2 Cities
    buildCity1();
    buildCity2();

    // creating the Boarding Card
    buildBoardingCard();

    // creating the Airport
    buildAirport1();
    buildAirport2();
    theFlight.setStartAirport(theAirport1);
    theFlight.setDestAirport(theAirport2);

    // creating the Plane
    buildPlane();
    theFlight.setPlane(thePlane);

    //passenger2 = buildPassenger2();
    theFlight.show();
  }



  /*
░█▀▄░█░█░▀█▀░█░░░█▀▄░░░█▄█░█▀▀░▀█▀░█░█░█▀█░█▀▄░█▀▀
░█▀▄░█░█░░█░░█░░░█░█░░░█░█░█▀▀░░█░░█▀█░█░█░█░█░▀▀█
░▀▀░░▀▀▀░▀▀▀░▀▀▀░▀▀░░░░▀░▀░▀▀▀░░▀░░▀░▀░▀▀▀░▀▀░░▀▀▀
 */

  private static void buildAirline() {
    theAirline = new Airline("British Airways", "BA");}
  private static void buildPlane() {
    thePlane =  new Plane("A320", "10000", 0.0F, "D-ABZI");
  }


  private static void buildPassenger1() {
    thePassenger1 = new Passenger("Franz");
  }
  private static void buildPassenger2() {
    thePassenger1 = new Passenger("Marie");
  }



  /**
   * @author Matthias Vollmer
   */
  private static void buildFlight() {
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

    theFlight = new Flight(toDepartureDate, toArrivalDate,"LH400", theAirport1,
            theAirport2, thePlane, new Pilot[]{theCaptain, theCopilot}, new BoardingCard[] {cardToNy},
            new Passenger[]{thePassenger1, thePassenger2}, theCaptain);
    theFlight.setCoPilot(theCopilot);
  }

  private static void buildBoardingCard() {
    // creating the Date of the first flights arrival
    GregorianCalendar toArrivalCalendar = new GregorianCalendar();
    toArrivalCalendar.set(2022, 6, 8);
    Date toArrivalDate = Date.from(toArrivalCalendar.toZonedDateTime().toInstant());

    // Creating the Seats
    toSeat1 = new Seat('A', 16, Seat.SeatClass.BUSINESS);
    toSeat2 = new Seat('B', 16, Seat.SeatClass.BUSINESS);
    fromSeat1 = toSeat1;
    fromSeat2 = toSeat2;

    theBoardingCard = new BoardingCard(new BigInteger("502675128554624"),"65 18:50 5D D", toArrivalDate, toSeat1);
  }

  private static void buildCaptain() {
    theCaptain = new Pilot("Mr. Hermann");
  }

  private static void buildCopilot() {
    theCopilot = new Pilot("Whitetaker, John");
  }

  private static void buildAirport1() {
    theAirport1 = new Airport("Frankfurt", "FRA", city1, new City[]{city1, city2}, null);
  }
  private static void buildAirport2() {
    theAirport2 = new Airport("LaGuardia", "LGA", city2, new City[]{city2}, null);
  }

  private static void buildCity1() {
    city1 = new City("Frankfurt (Main)");
  }
  private static void buildCity2() {
    city2 = new City("New York");
  }
  //private static Passenger buildPassenger2() {
  //  return new Passenger("Marie");}




}
