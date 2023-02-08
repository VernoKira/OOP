package practice1;
import java.util.*;
public class Pr12 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int a ;
		int b;
		a = input.nextInt();
		b = input.nextInt();
		int area = a*b;
		System.out.println(area);
		int perimeter = (a+b)*2;
		System.out.println(perimeter);
		double diagonal = Math.sqrt((Math.pow(a,2)+ Math.pow(b,2)));
		System.out.println(diagonal);
	 input.close();
	}

}
