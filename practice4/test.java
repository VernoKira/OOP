package practice4;
import java.util.*;
public class test {
	 public static void Main (String[] args) {
	        String s;
	        Scanner inp = new Scanner (System.in);
	        s =  inp.nextLine();
	        String name;
	        int num;
	        num = inp.nextInt();
	        name = inp.nextLine();
	        if(s=="Ring") {
	            Rings r = new Rings(name, num,Color.RED);
	            System.out.println(r.toString());

	        }
	        if(s=="Earring") {
	            Earrings e = new Earrings(name, num, Color.BLUE);
	            System.out.println(e.toString());

	        }



	    }
}
