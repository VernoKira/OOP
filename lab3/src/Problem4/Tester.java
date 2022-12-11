package Problem4;

import java.util.*;
public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Karina", 50000, "E", new Date(4/7/2004));
		Employee e1 =(Employee)e.clone();
		Vector<Employee> v = new Vector<Employee>();
		v.add(new Employee("Nurikk", 300000, "E1", new Date(4/5/2000)));
		v.add(new Employee("Rizotto", 200000, "E2", new Date(12/4/2002)));
		v.add(new Employee("Dopio", 100000, "E3", new Date(4/4/2001)));
		v.add(new Employee("Putchi", 500000, "E4", new Date(2/1/1995)));

				
		Collections.sort(v, new NameComparator());
		for(Employee em:v) {
			System.out.println(em);
		}

		System.out.println("Managers: ");
		Manager m1 = new Manager("Alima", 90000, "M1", new Date(26/1/2003) );
		m1.addBonus(3000);
	    v.add(m1);
	    Manager m2 = new Manager("Erda", 92000, "M2", new Date(30/6/2000));
	    m2.addBonus(5000);
	    v.add(m2);
	    Collections.sort(v, new NameComparator());
	    for (Employee p: v) {
	      System.out.println(p);
	    }
	  }

}

