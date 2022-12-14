import java.math.BigInteger;
import java.util.Date;

/**
 * @author Philipp Flödl
 */
public class BoardingCard {
  private final BigInteger identificationNumber;
  private final String gateCode;
  private final Date boardingTime;
  private Passenger owner; //ein Passagier bucht einen Flug, aber er bekommt die Bordkarte und Besitzt sie
  private Flight event; //der Flug/Busreise ist das Event/ das Ereignis der BoardingCard/Teilnehmerkarte?
  private Seat reservables; //mehrere BoardingCars können den gleichen Sitz reservieren in einem Planungszeitraum


  public BoardingCard(BigInteger identificationNumber, String gateCode, Date boardingTime, Seat seat){
    if (identificationNumber.compareTo(BigInteger.valueOf(0)) < 0){
      throw new IllegalArgumentException(identificationNumber+" as identificationNumber is negativ.");
    }
    this.identificationNumber = identificationNumber;
    //this.designator = designator;
    this.gateCode = gateCode;
    this.boardingTime = boardingTime;
    this.reservables = seat;
  }

  public BigInteger getIdentificationNumber() {
    return identificationNumber;
  }

  public String getGateCode() {
    return gateCode;
  }

  public Date getBoardingTime() {
    return boardingTime;
  }

  public Passenger getOwner() {
    return owner;
  }

  public Flight getEvent() {
    return event;
  }

  public Seat getReservables() {
    return reservables;
  }

  public void setOwner(Passenger owner) {
    this.owner = owner;
  }

  public void setEvent(Flight event) {
    this.event = event;
  }

  public void setReservables(Seat reservables) {
    this.reservables = reservables;
  }

  public String toString(){
    return getClass().getSimpleName()+ " " + identificationNumber;
  }

  public void scan(){ //auch als boolean möglich, auf null prüfen können
    System.out.println(toString()+" is scanned.");
  }
}
