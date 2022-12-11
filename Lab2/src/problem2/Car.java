package problem2;
import java.util.*;

public class Car extends Vehicle {

  public String Model_name;
  public String Number;
  
  public Car() {
    super();
  }
  
  public Car(String Brand_name, String Beep, String Model_name,String Number) {
    super(Brand_name, Beep);
    this.Model_name=Model_name;
    this.Number=Number;
  }
  
  public String toString() {
    return super.toString() + " Model name: " + this.Model_name + " Number " + this.Number;
    
  }
  
  public boolean equals(Object o) {
    if(!super.equals(o)) return false;
    Car c = (Car) o;
    return this.Model_name.equals(Model_name) && this.Number.equals(Number);
  }
  
  public int hashCode() {
    return Objects.hash(Model_name,Number);
  }
  
}
