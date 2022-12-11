package Problem4;

import java.util.*;

public class Manager extends Employee {
  
  private Vector<Employee> team = new Vector<Employee>();
  private double bonus;
  
  
  public Manager(String name, int salary,  String insuranceNumber, Date hireDate) {
	  super(name, salary, insuranceNumber, hireDate);
    this.bonus = 0;
  }
  
  public Vector<Employee> getTeam() {
    return team;
  }
  
  public void setTeam(Vector<Employee> team) {
    this.team = team;
  }
  
  public void addTeamMember(Employee employee) {
    team.add(employee);
  }
  
  public double getBonuses() {
    return bonus;
  }
  public void addBonus(double bonus) {
	    this.bonus = this.bonus + bonus;
	    this.setSalary(this.getSalary() + bonus);
	  }
  

  public Manager clone() throws CloneNotSupportedException {
    Manager cloned = (Manager)super.clone();
    cloned.setTeam((Vector<Employee>)team.clone());
    return cloned;
  }
  
  @Override
  public int compareTo(Object object) {
    if (object instanceof Manager && super.compareTo(object) == 0) {
      Manager manager = (Manager)object;
      if (bonus < manager.bonus) return -1;
      if (bonus > manager.bonus) return 1;
    }
    return super.compareTo(object);
  }
  
  @Override
  public boolean equals(Object object) {
    if (!super.equals(object))
      return false;
    Manager manager = (Manager)object;
    if (this.team.equals(manager.team) && this.bonus == manager.bonus)
      return true;
    return false;
  }
  
  
  public String toString() {
	    return super.toString() + "\nBonuses: " + bonus ;
	  }
}