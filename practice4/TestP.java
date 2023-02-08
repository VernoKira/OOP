package practice4;
import java.util.*;

public class TestP {
	  public static void main(String[] args) {
		    Student s = new Student("Riza","Saina","IS",2004,123456);
		    Staff st = new Staff("Aryn","Nazarbayeva","24Lyceum",500000);
		    
		    Vector<Person> p= new Vector <Person>();
		    Vector<Person> p1= new Vector <Person>();
		    
		    p.add(st);
		    p1.add(s);
		    
		    System.out.println(p);
		    System.out.println(p1);
		  }

		}

