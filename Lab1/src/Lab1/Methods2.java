package Lab1;

public class Methods2 {
	String name;
	int mid;
	int end;
	private int id;
	int d;
	Sem2 semester;
	static int cntS = 0;
	public Methods2() {

	}
	{
		cntS += 1;
		
	}
	public static int year = 2022; 
	
	final String nameUni = "KBTU";
	
	public Methods2(int id) {
		this.id = id;
	}
	public Methods2(int id,String name) {
		this(id);
		this.name = name;
	}
	public Methods2(int id, String name, Sem2 semester) {
		this(id,name);
		this.semester= semester;
		
	}
	public Methods2(int id, String name, Sem2 semester, int mid, int end) {
		this(id, name, semester);
		this.mid = mid;
		this.end = end;
	}
	public int Sum(int mid, int end) {
		return mid+end;
		
	} 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public String toString() {
		return cntS+" "+"Student of:"+nameUni + "; " + "BD: "+ year +" " 
									+ "semester: "+semester+" "+"name: " +name+" "+ "id: "+ +id +" "+"SUM " + Sum(mid, end); 
	}
	
	
	
	
	
	

}
