import java.time.LocalTime;
/**
 * @author Philipp Flödl
 */
public class BoardingCard {
  private final int identificationNumber;
  private final String gateCode;
  private final LocalTime boardingTime;
  private Passenger besitzer; //ein Passagier bucht einen Flug, aber er bekommt die Bordkarte und Besitzt sie
  private Flight ereignis; //der Flug/Busreise ist das Event/ das Ereignis der BoardingCard/Teilnehmerkarte?
  private Seat reservierbares; //mehrere BoardingCars können den gleichen Sitz reservieren in einem Planungszeitraum


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

  public Passenger getBesitzer() {
    return besitzer;
  }

  public Flight getEreignis() {
    return ereignis;
  }

  public Seat getReservierbares() {
    return reservierbares;
  }

  public void setBesitzer(Passenger besitzer) {
    this.besitzer = besitzer;
  }

  public void setEreignis(Flight ereignis) {
    this.ereignis = ereignis;
  }

  public void setReservierbare(Seat reservierbares) {
    this.reservierbares = reservierbares;
  }

  public String toString(){
    return ""+getClass()+ "  " + identificationNumber; //kennzeichendesAttribut
  }

  public void scannen(){ //auch als boolean möglich, auf null prüfen können
    System.out.println(toString()+" is scanned.");
  }
}
