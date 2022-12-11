package Lab1;

public class TestTemp3 {
	public static void main(String [] args) {
		Temp3 t1 = new Temp3("C" , 40);
		System.out.println(t1.toString());
		t1.setScale("C");
	
		System.out.println(t1.toString());
		}		
	}

