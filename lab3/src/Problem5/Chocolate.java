package Problem5;

import java.util.Objects;

public class Chocolate implements Comparable<Chocolate>{
  public int hashCode() {
    return Objects.hash(name, weight);
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Chocolate other = (Chocolate) obj;
    return Objects.equals(name, other.name)
        && Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
  }

  double weight;
  String name;
  
  public Chocolate() {
    
  }
  
  public Chocolate(double weight, String name) {
    this.weight = weight;
    this.name = name;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  public int compareTo(Chocolate o) {
    if(this.weight == o.weight) {
      return 0;
    }
    else if(this.weight > o.weight) {
      return 1;
    }
    else return -1;
  }
  public String ToString() {
    return "Name: " + getName() + ". Weight: " + getWeight();
  }
}