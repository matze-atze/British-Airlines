import java.util.HashSet;

public class Passenger {
  private final String name;
  private HashSet<BoardingCard> berechtigungen = new HashSet<>();

  public Passenger(String name){
    this.name = name;
    System.out.println(toString()+" is created.");
  }

  public String getName(){
    return name;
  }

  public HashSet<BoardingCard> getBerechtigungen() {
    return berechtigungen;
  }

  public boolean addBerechtigung(BoardingCard nächsteBerechtigung){
    boolean success = false;
    if (nächsteBerechtigung!=null){
      berechtigungen.add(nächsteBerechtigung);
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
