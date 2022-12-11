package problem2;
import java.util.*;

public class TestV {

  public static void main(String[] args) {
    Vehicle ve= new Vehicle("Ford", "tu-tu");
    Vehicle ve3= new Vehicle("Ford", "tu-tu");
    Vehicle ve2= new Vehicle("Porshe", "tu-tu");
    Car c = new Car("Ford", "tu-tu", "Bentley","06.SSS");
    
    Vector <Vehicle> v = new Vector <Vehicle> ();
    v.add(ve);
    v.add(c);
    v.add(ve2);
    v.add(ve3);
    
    HashSet<Vehicle> h = new HashSet<Vehicle>();
    h.add(ve);
    h.add(c);
    
    System.out.println(ve.equals(ve2));
  }


}