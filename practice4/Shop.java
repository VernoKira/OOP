package practice4;
import java.util.*;
public class Shop {
	 public static void main (String[] args) {
	        
		 
	        Scanner input = new Scanner (System.in);
	        String s;
	        s =  input.next();
	        String name;
	        int num;
	        num = input.nextInt();
	        name = input.next();
	        if(s=="Ring") {
	            Rings r = new Rings(name, num,Color.RED);
	            System.out.println(r.toString());
	            input.close();

	        }
	        else if(s=="Earring") {
	            Earrings e = new Earrings(name, num, Color.BLUE);
	            System.out.println(e.toString());

	        }



	    }
	
}
