/**
 *
 * @author Nazanin Golalizadeh
 * @version 06.10.2022
 *
 */

public class City {
    private String name;
    private Airport verkehrseinrichtingen;
    private Airport airport;


    public City(String name, Airport verkehrseinrichtungen, Airport airport){
        this.name = name;
        this.verkehrseinrichtingen = verkehrseinrichtungen;
        this.airport= airport;


    }

    //name
    public String getName(String name) {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //verkehrseinrichtungen
    public Airport getVerkehrseinrichtingen(){
        return verkehrseinrichtingen;
    }

    public void setVerkehrseinrichtingen(Airport verkehrseinrichtingen) {
        this.verkehrseinrichtingen = verkehrseinrichtingen;
    }

    //airport
    public Airport getAirport(Airport airport) {
        return airport;
    }

    public void setAirport(Airport airport){
        this.airport = airport;
    }
}
