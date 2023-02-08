package practice1;
import java.util.*;
public class Pr11 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String s;
		s = input.next();
		System.out.print("+");
		for(int i=0; i<s.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
		System.out.print("|");
		System.out.print(s);
		System.out.println("|");
		System.out.print("+");
		for(int i=0; i<s.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
		input.close();
	}
	
}
