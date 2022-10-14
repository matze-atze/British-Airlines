import java.util.Date;

/**
 * Die Klasse kann benutzt werden um Objekte von Flug zu erzeugen
 * @author Abedalrhman Abdulaal
 * @version 08.10.2022
 *
 */
public class Flight {

    private Pilot captain;
    private Pilot coPilot;

    private Date departure;                                     // abflug des Fluges (z.B. 08.10.2022)
    private Date arrival;                                     // ankunft des Fluges (z.B. 08.10.2022)
    private String flightNumber;                              // Flugnummner (z.B. AZ.0407)

    private Airport startAirport;                       // Flughafen an dem der Flug startet (z.B. [ATL] - Atlanta)
    private Airport destAirport;                        // FLughafen an dem der Flug landed (z.B. [FRA] - Frankfurt am Main]

    private Plane plane;                              // Flugzeug mit dem der FLug durch geführt wird (z.B. Boeing 123)

    private int pilotCounter = 0;                           // Interne Variable für Anzahl der Piloten
    private Pilot[] pilots = new Pilot[2];                  // Piloten die den Flug durchführen

    private int BoardCardCounter = 0;                     // Interne Variable für Anzahl der Boardkarten
    private BoardingCard[] BoardCards = new BoardingCard[853]; // Boardkarten die für den Flug erstellt wurden

    private int passengerCounter = 0;                       // Interne Variable für die Anzahl der Passagiere
    private Passenger[] passengers = new Passenger[853];    // Passagiere die in dem Flug mit fliegen

    public Flight(Date arrival, Date departure, String flightNumber, Airport startAirport, Airport destAirport, Plane plane,
                  Pilot[] pilots, BoardingCard[] boardingCard, Passenger[] passengers, Pilot captain) {
        this.arrival = arrival;
        this.departure = departure;

        this.flightNumber = flightNumber;

        this.startAirport = startAirport;
        this.destAirport = destAirport;

        this.plane = plane;

        for (Pilot pilot : pilots) {
            this.pilots[pilotCounter] = pilot;
            pilotCounter++;
        }

        for (BoardingCard boardCard : boardingCard) {
            this.BoardCards[BoardCardCounter] = boardCard;
            BoardCardCounter++;
        }

        for (Passenger passenger : passengers) {
            this.passengers[passengerCounter] = passenger;
            passengerCounter++;
        }

        this.captain = captain;

        System.out.println(toString() + " on 2022-10-12");
    }

    // GETTER

    public Date getDeparture() {
        return departure;
    }

    public Pilot getCaptian() {
        return captain;
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Date getArrival() {
        return arrival;
    }

    public Airport getStartAirport() {
        return startAirport;
    }

    public Airport getDestAirport() {
        return destAirport;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public Plane getPlane() {
        return plane;
    }

    public BoardingCard[] getBoardCards() {
        return BoardCards;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    // SETTER


    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }
    public void setCoPilot(Pilot coPilot) {
        this.coPilot = coPilot;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public void setStartAirport(Airport startAirport) {
        this.startAirport = startAirport;
    }

    public void setDestAirport(Airport destAirport) {
        this.destAirport = destAirport;
    }

    public void setPilots(Pilot[] pilots) {
        this.pilots = pilots;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setBoardCards(BoardingCard[] boardCards) {
        this.BoardCards = boardCards;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    // SPECIAL SETTER

    /**
     * Hinzufügen vom Pilot/en zum Flug
     */
    public void addPilot(Pilot... pilotsToAdd) {
        for (Pilot pilot : pilotsToAdd) {
            pilots[pilotCounter] = pilot;
            pilotCounter++;
        }
    }

    /**
     * Hinzufügen von Boardkart/en zum Flug
     */
    public void addBoardingCard(BoardingCard... boardCards) {
        for (BoardingCard boardkarte : boardCards) {
            BoardCards[BoardCardCounter] = boardkarte;
            BoardCardCounter++;
        }
    }

    /**
     * Hinzufügen von Passagier/en zum Flug
     */
    public void addPassenger(Passenger... passengers) {
        for (Passenger passenger : passengers) {
            this.passengers[passengerCounter] = passenger;
            passengerCounter++;
        }
    }

    //Methoden

    /**
     * Flug verspaetet sich
     */
    public void delay(Date delayedTo){
        setArrival(delayedTo);
        System.out.println(toString() + "verspaetet sich - neue Abflugszeit: " + delayedTo);
    }

    public String toString(){
        return getClass().getSimpleName()+ " " + flightNumber;
    }
}
