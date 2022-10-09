import java.util.ArrayList;

/**
 * 
 * @author Ebert Marcel (mebert1)
 */
public class Airline
{
    private ArrayList<Flight> offer;
    private ArrayList<Pilot> employee;
    private String name;
    private String IATAcode;

    public Airline(String name, String IATAcode)
    {
        this.name = name;
        this.IATAcode = IATAcode;
        System.out.println(toString() + " created");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Flight> getOffer() {
        return offer;
    }

    public ArrayList<Pilot> getEmployee() {
        return employee;
    }

    public String getIATAcode() {
        return IATAcode;
    }

    public void setOffer(ArrayList<Flight> offer) {
        this.offer = offer;
    }

    public void setEmployee(ArrayList<Pilot> employee) {
        this.employee = employee;
    }

    public void addAngebote(Flight offer) {
        this.offer.add(offer);
    }

    public void addArbeitNehmer(Pilot employee) {
        employee.hire(this);
    }

    @Override
    public String toString() {
        return "<Airline> <"+name+" "+ IATAcode +"> ";
    }

}

