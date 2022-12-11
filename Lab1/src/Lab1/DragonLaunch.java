package Lab1;
import java.util.*;

public class DragonLaunch {
  
    Gender g;
    static Vector<Person> vec = new Vector<Person>();
    
    public static void kidnap(Person p) {
      vec.add(p);
      }
    public static boolean willDragonEatOrNot() {
    	int cnt=0;
    	for(int i=0; i<vec.size(); i++) {
    		if(vec.get(i).g == Gender.BOY) {
    			cnt++;
    		}
    		else cnt--;
    		
    	}
    	if(cnt!=0) {
    		return true;
    	}
    	return false;
    }
    public static void main(String[] args) {
      Person p1 = new Person(Gender.BOY);
      System.out.println(p1.toString());
      kidnap(p1);
      Person p2 = new Person(Gender.GIRL);
      System.out.println(p2.toString());
      kidnap(p2);
      Person p3 = new Person(Gender.BOY);
      System.out.println(p3.toString());
      kidnap(p3);
      Person p4 = new Person(Gender.BOY);
      System.out.println(p4.toString());
      kidnap(p4);
      if(willDragonEatOrNot()) {
        System.out.println("The Dragon will eat today");
      }
      else {
        System.out.println("The Dragon won't eat today");
      }
    }
}