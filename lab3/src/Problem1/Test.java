package Problem1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s1 = new Triangle(2, 5, 7, 4);
		System.out.println(s1);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Shape s2 = new Parallelepiped(a,b,c);
		System.out.println(s2);
		sc.close();
	}

}
