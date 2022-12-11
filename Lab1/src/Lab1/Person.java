package Lab1;
public class Person {
	  Gender g;
	  Person(Gender g){
	    this.g = g;
	  }
	  public String toString() {
	    return "This is a " + this.g;
	  }
	}