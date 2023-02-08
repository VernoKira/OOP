package practice1;
import java.util.*;
public class Pr16 {
	public static void main(String[] args) {
		String s;
		Scanner input = new Scanner(System.in);
		s = input.next();
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.equals(s)) {
			System.out.print("yes palindrome");
		}
		else {
			System.out.println("no");
		}
		input.close();
}
}
