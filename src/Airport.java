/**
 *
 * @author Nazanin Golalizadeh
 * @version 06.10.2022
 *
 */

public class Airport {
    private String name;
    private String iataCode;
    private City catchmentArea; //association // deutsch: Einzugsgebiet
    private City[] cities;
    private Flight[] flights;
    private String departures;
    private String arrivals;
    private String iatacode;


    public Airport(String name, String iataCode, City catchmentArea, City[] cities, Flight[] flight, String departures, String arrivals){

        this.name = name;

        this.iataCode = iataCode;

        this.catchmentArea = catchmentArea;

        this.cities = cities;

        this.flights = flight;

        this.departures= departures;

        this.arrivals= arrivals;

    }

//name
    public String getName(String name) {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //iataCode
    public String getIatacode() {
        return iatacode;
    }

    public void setIatacode(String iatacode) {
        this.iatacode = iatacode;
    }

    //einzugsGebiet
    public City getCatchmentArea(){
        return catchmentArea;
    }

    public void setCatchmentArea(City catchmentArea){
        this.catchmentArea = catchmentArea;
    }

    //city
    public City[] getCity(){
        return cities;
    }

    public void setCity(City[] cities){
        this.cities = cities;
    }

    //flight
    public Flight[] getFlights() {
        return flights;
    }

    public Flight getFlight(int index) {
        return flights[index];
    }

    public void setflights(Flight[] flights) {
        this.flights = flights;
    }

    public void setFlight(Flight flight, int index) {
        this.flights[index] = flight;
    }

    //departures
        public String getDepartures(){
            return departures;
        }

        public void setDepartures(String departures) {
            this.departures = departures;
        }

    //arrivals
            public String getArrivals(){
                return arrivals;
            }

            public void setArrivals(String arrivals) {
                this.arrivals = arrivals;
            }


    public void reserve(){
        System.out.println(toString() + "reserve");
    }
    public void deIce(){
        System.out.println(toString() + "removed Ice");
    }


    @Override
    public String toString() {
        return "<Airline> <"+name+" "+ iataCode +"> ";
    }
}
