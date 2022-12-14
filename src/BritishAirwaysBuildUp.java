import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Kadir, Matthias, Marcel, Nazanin
 */
public class BritishAirwaysBuildUp {

  private static Airline theAirline;
  private static Flight theFlight;

  private static Flight flightBack;
  private static Pilot theCaptain;
  private static Pilot theCopilot;
  private static Passenger thePassenger1;
  private static Passenger thePassenger2;
  private static BoardingCard theToBoardingCard1;
  private static BoardingCard theToBoardingCard2;
  private static BoardingCard theFromBoardingCard;
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
    flightBack.setProvider(theAirline);

    // creating the 2 Cities
    buildCity1();
    buildCity2();

    // creating the Boarding Card
    buildBoardingCard();
    thePassenger1.addPermission(theToBoardingCard1);
    thePassenger1.addPermission(theFromBoardingCard);
    thePassenger2.addPermission(theToBoardingCard2);


    // creating the Airport
    buildAirport1();
    buildAirport2();
    theFlight.setStartAirport(theAirport1);
    theFlight.setDestAirport(theAirport2);
    flightBack.setStartAirport(theAirport2);
    flightBack.setDestAirport(theAirport1);

    // creating the Plane
    buildPlane();
    theFlight.setPlane(thePlane);
    flightBack.setPlane(thePlane);

    // flight there report
    theFlight.show();

    // flight back report
    flightBack.show();
  }



  /*
??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????
 */

  private static void buildAirline() {
    theAirline = new Airline("British Airways", "BA");}
  private static void buildPlane() {
    thePlane =  new Plane("A320", "10000", 0.0F, "D-ABZI");
  }


  private static void buildPassenger1() {
    thePassenger1 = new Passenger("M??ller, Franz");
  }
  private static void buildPassenger2() {
    thePassenger2 = new Passenger("M??ller, Marie");
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

    // creating the Date of the second flights arrival
    GregorianCalendar fromArrivalCallender = new GregorianCalendar();
    fromArrivalCallender.set(2022, 6, 11);
    Date fromArrivalDate = Date.from(fromArrivalCallender.toZonedDateTime().toInstant());

    Pilot[] pilots = new Pilot[]{theCaptain, theCopilot};
    BoardingCard[] boardingCard = new BoardingCard[] {cardToNy};

    theFlight = new Flight(toArrivalDate, toDepartureDate,"LH400", theAirport1,
            theAirport2, thePlane, pilots, boardingCard,
            new Passenger[]{thePassenger1, thePassenger2}, theCaptain);
    theFlight.setCoPilot(theCopilot);

    flightBack = new Flight(fromArrivalDate,fromDepartureDate,"LH400", theAirport2,
            theAirport1,thePlane, pilots, boardingCard, new Passenger[]{thePassenger1},theCaptain);
    flightBack.setCoPilot(theCopilot);
  }



  private static void buildBoardingCard() {
    // creating the Date of the first flights arrival
    GregorianCalendar toArrivalCalendar = new GregorianCalendar();
    toArrivalCalendar.set(2022, 6, 8);
    Date toArrivalDate = Date.from(toArrivalCalendar.toZonedDateTime().toInstant());

    // creating the Date of the second flights departure
    GregorianCalendar fromDepartureCalender = new GregorianCalendar();
    fromDepartureCalender.set(2022, 6, 11);
    Date fromDepartureDate = Date.from(fromDepartureCalender.toZonedDateTime().toInstant());

    // Creating the Seats
    toSeat1 = new Seat('A', 16, Seat.SeatClass.BUSINESS);
    toSeat2 = new Seat('B', 16, Seat.SeatClass.BUSINESS);
    fromSeat1 = toSeat1;
    fromSeat2 = toSeat2;

    theToBoardingCard1 = new BoardingCard(new BigInteger("502675128554624"),"65 18:50 5D D", toArrivalDate, toSeat1);
    theToBoardingCard1.setEvent(theFlight);
    theToBoardingCard2 = new BoardingCard(new BigInteger("456415602377890"), "65 18:50 5D D", toArrivalDate, toSeat2);
    theToBoardingCard2.setEvent(theFlight);
    theFromBoardingCard = new BoardingCard(new BigInteger("456434531234568"), "58 10:50 4C C", fromDepartureDate , toSeat1);
    theFromBoardingCard.setEvent(flightBack);
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
