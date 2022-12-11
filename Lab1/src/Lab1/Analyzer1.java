package Lab1;
import java.util.*;
public class Analyzer1 {
	public static void main(String[] args) {
		int num=0;
		Data1 d1 = new Data1(num);
		String n="";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter number (Q to quit):");
			n = sc.nextLine();
			if(n.equals("Q")) break;
			else {
				num = Integer.parseInt(n);
				d1.setNum(num);
			}	
		}
		sc.close();
		System.out.println(d1.toString());
	}
	
}
