package Lab1;

public class TestMeth2 {
	public static void main(String [] args) {
		Methods2 m1 = new Methods2(12345, "Riza", Sem2.FIRST, 30,30);
		System.out.println(m1.toString());
	
		Methods2 m2 = new Methods2(15464,"Alima", Sem2.FIRST,30,25);
		System.out.println(m2.toString());
		Methods2 m3 = new Methods2(45646, "Sitora", Sem2.FIRST, 50,50);
		System.out.println(m3.toString());
	}
}