import java.util.Set;
import java.util.HashSet;
import java.time.LocalTime;

/**
 * @author Kadir
 */
public class Pilot
{
    private String nameCaptain;
    private String nameCoPilot;
    protected Airline arbeitGeber;
    private Set<Flight> tasks = new HashSet<>();

    public Pilot(String xNameCaptain, String xNameCoPilot){
        this.nameCaptain = xNameCaptain;
        this.nameCoPilot = xNameCoPilot;
    }

    public String getNameCaptain() {
        return nameCaptain;
    }

    public void setNameCaptain(String namePilot){
        this.nameCaptain = namePilot;
    }

    public void fire(){
        nameCaptain = null;
        nameCoPilot = null;
        System.out.println(toString() + " got fired.");
    }

    public void firePilot(){
        nameCaptain = null;
        System.out.println(toString() + " got fired.");
    }

    public void fireCoPilot(){
        nameCoPilot = null;
        System.out.println(toString() + " got fired.");
    }

    public void delay(){
        System.out.println(toString()+" is delayed.");
    }

    public String hire(String hirePilot, String hireCoPilot){
        this.nameCaptain = hirePilot;
        this.nameCoPilot = hireCoPilot;
        return this.nameCaptain + " and " + this.nameCoPilot + "got hired";
    }

}
