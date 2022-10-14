import java.util.Date;
import java.util.Set;
import java.util.HashSet;

/**
 * @author Kadir Erzurum
 */
public class Pilot
{
    private static String name;
    protected Airline employer;
    private Set<Flight> tasks = new HashSet<>();

    public Pilot(String name){
        this.name = name;
    }

    public static String getName() {
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

    public static void show(){
        System.out.println("Flown by " + buildCaptain() + "[" + "and " + buildCopilot() +"]");
    }

    private static String buildCaptain(){
        return "Mr, Hermann ";
    }

    private static String buildCopilot(){
        return "Whitetaker, John";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}
