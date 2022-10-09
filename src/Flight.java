import java.util.Date;

/**
 * Die Klasse kann benutzt werden um Objekte von Flug zu erzeugen
 * @author Abedalrhman Abdulaal
 * @version 08.10.2022
 *
 */
public class Flight {


    private Date datum;                                     // Datum des Fluges (z.B. 08.10.2022)
    private String flugNummer;                              // Flugnummner (z.B. AZ.0407)

    private Airport startFlughafen;                       // Flughafen an dem der Flug startet (z.B. [ATL] - Atlanta)
    private Airport zielFlughafen;                        // FLughafen an dem der Flug landed (z.B. [FRA] - Frankfurt am Main]

    private Plane flugzeug;                              // Flugzeug mit dem der FLug durch geführt wird (z.B. Boeing 123)

    private int pilotZaehler = 0;                           // Interne Variable für Anzahl der Piloten
    private Pilot[] pilots = new Pilot[2];                  // Piloten die den Flug durchführen

    private int boardkartenZaehler = 0;                     // Interne Variable für Anzahl der Boardkarten
    private Boardkarte[] boardkartes = new Boardkarte[853]; // Boardkarten die für den Flug erstellt wurden

    private int passagierZaehler = 0;                       // Interne Variable für die Anzahl der Passagiere
    private Passenger[] passagiers = new Passenger[853];    // Passagiere die in dem Flug mit fliegen

    public Flight(Date datum, String flugNummer, Airport startFlughafen, Airport zielFlughafen, Plane flugzeug, Pilot[] pilots, Boardkarte[] boardkartes, Passenger[] passagiers) {
        this.datum = datum;
        this.flugNummer = flugNummer;

        this.startFlughafen = startFlughafen;
        this.zielFlughafen = zielFlughafen;

        this.flugzeug = flugzeug;

        for (Pilot pilot : pilots) {
            this.pilots[pilotZaehler] = pilot;
            pilotZaehler++;
        }

        for (Boardkarte boardkarte : boardkartes) {
            this.boardkartes[boardkartenZaehler] = boardkarte;
            boardkartenZaehler++;
        }

        for (Passenger passagier : passagiers) {
            this.passagiers[passagierZaehler] = passagier;
            passagierZaehler++;
        }
        System.out.println(toString() + "angeleg");
    }

    // GETTER
    public String getFlugNummer() {
        return flugNummer;
    }

    public Date getDatum() {
        return datum;
    }

    public Airport getStartFlughafen() {
        return startFlughafen;
    }

    public Airport getZielFlughafen() {
        return zielFlughafen;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public Plane getFlugzeug() {
        return flugzeug;
    }

    public Boardkarte[] getBoardkartes() {
        return boardkartes;
    }

    public Passenger[] getPassagiers() {
        return passagiers;
    }

    // SETTER

    public void setFlugNummer(String flugNummer) {
        this.flugNummer = flugNummer;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setStartFlughafen(Airport startFlughafen) {
        this.startFlughafen = startFlughafen;
    }

    public void setZielFlughafen(Airport zielFlughafen) {
        this.zielFlughafen = zielFlughafen;
    }

    public void setPilots(Pilot[] pilots) {
        this.pilots = pilots;
    }

    public void setFlugzeug(Plane flugzeug) {
        this.flugzeug = flugzeug;
    }

    public void setBoardkartes(Boardkarte[] boardkartes) {
        this.boardkartes = boardkartes;
    }

    public void setPassagiers(Passenger[] passagiers) {
        this.passagiers = passagiers;
    }

    // SPECIAL SETTER

    /**
     * Hinzufügen vom Pilot/en zum Flug
     */
    public void addPilot(Pilot... piloten) {
        for (Pilot pilot : piloten) {
            pilots[pilotZaehler] = pilot;
            pilotZaehler++;
        }
    }

    /**
     * Hinzufügen von Boardkart/en zum Flug
     */
    public void addBoardKarte(Boardkarte... boardkarten) {
        for (Boardkarte boardkarte : boardkarten) {
            boardkartes[boardkartenZaehler] = boardkarte;
            boardkartenZaehler++;
        }
    }

    /**
     * Hinzufügen von Passagier/en zum Flug
     */
    public void addPassagier(Passenger... passengers) {
        for (Passenger passenger : passengers) {
            this.passagiers[passagierZaehler] = passenger;
            passagierZaehler++;
        }
    }

    //Methode

    /**
     * Flug wird eingestellet
     */
    public void einstellen() {
        System.out.println(toString() + "eingestellt");
    }

    /**
     * Flug verspaetet sich
     */
    public void verspaeten(){
        System.out.println(toString() + "verspaetet");
    }
}
