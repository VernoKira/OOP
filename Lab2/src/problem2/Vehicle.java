package problem2;
import java.util.*;


public class Vehicle {

  public String Brand_name;
  public String Beep;
  
  public Vehicle() {
    
  }
  
  public Vehicle(String Brand_name, String Beep) {
    this.Brand_name=Brand_name;
    this.Beep=Beep;
  }
  
  public String toString() {
    return "Brand: " + this.Brand_name + " Sound is " + this.Beep;
  }
  
  public boolean equals(Object o) {
      if(o==this) return true;
      if(o==null) return false;
      if(o.getClass()!=this.getClass()) return false;
      Vehicle v = (Vehicle) o;
      return this.Brand_name.equals(v.Brand_name) && this.Beep.equals(v.Beep);
    }
    public int hashCode() {
      return Objects.hash(Brand_name, Beep);
    }
  
}
