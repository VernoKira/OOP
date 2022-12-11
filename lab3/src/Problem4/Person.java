package Problem4;

import java.util.Date;
public class Person {
	protected String name;
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(this == null) return false;
		Person p = (Person) o;
		return this.name.equals(p.name);
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "";
	}
}

