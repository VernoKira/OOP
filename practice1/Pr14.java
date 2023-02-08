package practice1;
import java.util.*;
public class Pr14 {
	public static void main(String[] args) {
		int a, b, c ;
		double d, x1,x2;
		Scanner input = new Scanner (System.in);
		a = input.nextInt();
		b= input.nextInt();
		c= input.nextInt();	
		d= Math.pow(b, 2)-(4*a*c);
		if (d<0) {
			System.out.println("Error");
		}
		else {
		x1=((0-b)- Math.sqrt(d))/2*a;
		x2=((0-b)+ Math.sqrt(d))/2*a;
		System.out.println(x1);
		System.out.println(x2);
	}
		input.close();
}
}
