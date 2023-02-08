package practice1;
import java.util.*;
public class Pr13 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		if(n>=50 && n<=59) {
			System.out.println("F");
		}
		else if (n>=60 && n<=62){
			System.out.println("D-");
		}
		else if (n>=63 && n<=66){
			System.out.println("D");
		}
		else if(n>=67 && n<=69){
			System.out.println("D+");
		}
		else if (n>=70 && n<=72){
			System.out.println("C-");
		}
		else if (n>=73 && n<=76){
			System.out.println("C");
		}
		else if (n>=77 && n<=79){
			System.out.println("C+");
		}
		else if (n>=80 && n<=89){
			System.out.println("B");
		}
		else if (n>=90 && n<=100) {
			System.out.println("A");
		}
		input.close();
		
	}

}
