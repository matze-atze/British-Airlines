import java.util.HashSet;

/**
 * @author Philipp Flödl
 */
public class Passenger {
  private final String name;
  private HashSet<BoardingCard> permissions = new HashSet<>();

  public Passenger(String name){
    this.name = name;
    System.out.println(toString()+" is created.");
  }

  public String getName(){
    return name;
  }

  public HashSet<BoardingCard> getPermissions() {
    return permissions;
  }

  public boolean addBerechtigung(BoardingCard nextPermission){
    boolean success = false;
    if (nextPermission!=null){
      permissions.add(nextPermission);
      success = true;
    }
    return success;
  }

  public String toString(){
    return getClass().getSimpleName()+" "+name;
  }

  public void delay(){
    System.out.println(toString()+" is delayed.");
  }
}
