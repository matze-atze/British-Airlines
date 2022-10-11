import java.time.LocalTime;
/**
 * @author Philipp Flödl
 */
public class BoardingCard {
  private final int identificationNumber;
  private final String gateCode;
  private final LocalTime boardingTime;
  private Passenger owner; //ein Passagier bucht einen Flug, aber er bekommt die Bordkarte und Besitzt sie
  private Flight event; //der Flug/Busreise ist das Event/ das Ereignis der BoardingCard/Teilnehmerkarte?
  private Seat reservables; //mehrere BoardingCars können den gleichen Sitz reservieren in einem Planungszeitraum


  public BoardingCard(int identificationNumber, String gateCode, LocalTime boardingTime){
    if (identificationNumber < 0){
      throw new IllegalArgumentException(identificationNumber+" as identificationNumber is negativ.");
    }
    this.identificationNumber = identificationNumber;
    //this.designator = designator;
    this.gateCode = gateCode;
    this.boardingTime = boardingTime;
    System.out.println(toString()+" is created.");
  }

  public int getIdentificationNumber() {
    return identificationNumber;
  }

  public String getGateCode() {
    return gateCode;
  }

  public LocalTime getBoardingTime() {
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

  public void setReservierbare(Seat reservierbares) {
    this.reservables = reservierbares;
  }

  public String toString(){
    return getClass().getSimpleName()+ " " + identificationNumber;
  }

  public void scannen(){ //auch als boolean möglich, auf null prüfen können
    System.out.println(toString()+" is scanned.");
  }
}
