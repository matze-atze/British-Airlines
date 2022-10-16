import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Philipp Flödl
 */
public class Passenger {
  private final String name;
  private HashSet<BoardingCard> permissions = new HashSet<>();

  public Passenger(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public HashSet<BoardingCard> getPermissions() {
    return permissions;
  }

  public boolean addPermission(BoardingCard nextPermission){
    boolean success = false;
    if (nextPermission!=null){
      permissions.add(nextPermission);
      success = true;
    }
    return success;
  }

  public String toString(){
    return " "+name;
  }

  public void delay(){
    System.out.println(toString()+" is delayed.");
  }

  public void show(Flight forFlight) {
    Seat onSeat = new Seat('A', 5, Seat.SeatClass.FIRST);
    for (Iterator<BoardingCard> it = permissions.iterator(); it.hasNext(); ) {
      BoardingCard bc = it.next();
      if (bc.getEvent() == forFlight) onSeat = bc.getReservables();
    }
    System.out.print(name + " on " + onSeat);
  }
}
