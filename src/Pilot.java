import java.util.Set;
import java.util.HashSet;

/**
 * @author Kadir Erzurum
 */
public class Pilot
{
    private String name;
    protected Airline arbeitGeber;
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

    public void delay(){
        System.out.println(toString()+" is delayed.");
    }

    public String hire(Airline arbeitGeber){
        this.arbeitGeber = arbeitGeber;
        return this.name + " got hired by " + arbeitGeber.getName();
    }

    @Override
    public String toString() {
        return "<" + getClass().getSimpleName() + "> <" + name + ">";
    }
}
