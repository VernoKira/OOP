package practice4;

public class Owl extends Animal{
	
	public Owl() {
		super();
	}
	public Owl(String initialName) {
		super(initialName);
	}
	
	public String ability() {
		return "I can turn my head 270 degrees and I can fly";
	}
	
	public String voice() {
		return "qoo qoo";
	}
	public String toString() {
		return "Hello, my name is "+ name +"\n"+ability()
		+ "\n" +voice(2) + super.toString();
	}
}

