/**
 *
 * @author Nazanin Golalizadeh
 * @version 06.10.2022
 *
 */

public class City {
    private String name;
    private Airport trafficFacility; // deutsch: Verkehrseinrichtung
    private Airport airport;


    public City(String name, Airport trafficFacility, Airport airport){
        this.name = name;
        this.trafficFacility = trafficFacility;
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
    public Airport getTrafficFacility(){
        return trafficFacility;
    }

    public void setTrafficFacility(Airport trafficFacility) {
        this.trafficFacility = trafficFacility;
    }

    //airport
    public Airport getAirport(Airport airport) {
        return airport;
    }

    public void setAirport(Airport airport){
        this.airport = airport;
    }

    public String toString(){
        return getClass().getSimpleName()+" " + name;
    }
}
