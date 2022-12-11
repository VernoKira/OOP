package Problem4;
import java.util.Date;
import java.util.Vector;
public class Employee extends Person implements Cloneable, Comparable{
	protected double salary;
	protected String insuranceNumber;
	Date hireDate;
	Vector<Employee> employees = new Vector<Employee>();
	public Employee() {
		
	}
	public Employee(String name, double salary, String insuranceNumber, Date hireDate) {
		super(name);
		this.salary = salary;
		this.insuranceNumber = insuranceNumber;
		this.hireDate = hireDate;
		Employee emp = new Employee();
		setEmployee(emp);
	}
	public void setEmployee(Employee emp) {
		employees.add(emp);
	}
	public Vector<Employee> getEmployee() {
		return employees;
	}
	public double getSalary() {
	    return salary;
	  }
	  
	  public void setSalary(double salary) {
	    this.salary = salary;
	  }
	public boolean equals(Object o) {
		if(this == o) return true;
		if(this == null) return false;
		Employee emp = (Employee) o;
		return super.equals(o) && this.hireDate.equals(emp.hireDate) && 
				salary == emp.salary && this.insuranceNumber.equals(emp.insuranceNumber);
	}
	public Object clone() throws CloneNotSupportedException{
		Employee copy = (Employee)super.clone();
		copy.hireDate = (Date)hireDate.clone();
		return copy;
	}
	public int compareTo(Object o) {
		Employee other = (Employee) o;
		if(salary < other.salary) return 1;
		if(salary > other.salary) return -1;
		return 0;
	}
	public String toString() {
		return "Name of the employee: " + name + ", "
				+ "salary: " + salary + ", "
				+ "Hire date: " + hireDate + ", "
				+ "Insurance number: " + insuranceNumber;
	}
}
