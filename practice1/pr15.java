package practice1;
import java.util.*;
public class pr15 {
	public static void main (String[] args) {
		int a ,b,c;
		Scanner input = new Scanner(System.in);
		a=input.nextInt();
		b = (a*15)/100;
		c = a-b;
		System.out.println(c);
		input.close();
		
	}

}
