import java.time.LocalTime;
/**
 * @author Philipp Flödl
 */
public class BoardingCard {
  private final int identificationNumber;
  //private final String designator; //Kürzel der Fluggesellschaft(wir haben keine Assoziation), die die Bordkarte rausbringt
  private final String gateCode;
  private final LocalTime boardingTime; //Date besser? oder char[4]
  private Passenger besitzer; //ein Passagier bucht einen Flug, aber er bekommt die Bordkarte und Besitzt sie
  private Flight ereignis; //der Flug/Busreise ist das Event/ das Ereignis der BoardingCard/Teilnehmerkarte?
  private Seat reservierbares; //mehrere BoardingCars können den gleichen Sitz reservieren in einem Planungszeitraum

  //theFlight, theSeat wäre ich einverstanden, und designator kann weg und anderer Datentyp bei boardingTime

  public BoardingCard(int identificationNumber, String gateCode, LocalTime boardingTime){
    this.identificationNumber = identificationNumber;
    //this.designator = designator;
    this.gateCode = gateCode;
    this.boardingTime = boardingTime;
    System.out.println(toString()+" is created.");
  }

  public int getIdentificationNumber() {
    return identificationNumber;
  }

  /*public String getDesignator() {
    return designator;
  }*/

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
