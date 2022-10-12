import java.util.Date;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Kadir Erzurum
 */
public class Pilot
{
    private String name;
    protected Airline employer;
    private Set<Flight> tasks = new HashSet<>();

    public Pilot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String namePilot){
        this.name = namePilot;
    }

    public void fire(){
        name = null;
        System.out.println(toString() + " got fired.");
    }

    public void firePilot(){
        name = null;
        System.out.println(toString() + " got fired.");
    }

    public void delay(Date delayedTo, Flight flight){
        if (this.tasks.contains(flight)) return;
        flight.delay(delayedTo);
    }

    public String hire(Airline employer){
        this.employer = employer;
        return this.name + " got hired by " + employer.getName();
    }

    public void show(){
        System.out.println("Flown by " + getName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}
