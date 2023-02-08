
package practice4;
import java.util.*;
public class OwlTest {
	public static void main (String[] args) {
		String n;
		Scanner inp = new Scanner(System.in);
		n = inp.nextLine();
		Owl o = new Owl(n);
		System.out.println(o.toString());
		
		inp.close();
	}
	

}

