package practice4;

public class Animal {
	String name;
	String skill;
	public Animal() {
		name = " ";
	}
	public Animal(String initialName) {
		this.name = initialName;
	}
	
	public String ability() {
		return "I can sleep and run";
	}
	public String voice(int n) {
		String res = "";
		for(int i = 0; i<n;i++) {
			res+=voice()+" ";
		}
		return res;
		
	}
	public String voice() {
		return "Not defined!";
	}
	public String toString() {
		return "hello hehe";
	}
	
	
	
	
}
