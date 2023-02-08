package lecture;

public abstract class Circle{
	String s = "O";
//	Color color;
	
	public Circle(Color color, int pos) {
		super(color, pos);
	}
	
	void draw() {
		System.out.println(" ".repeat(pos));
		if(color== Color.BLACK) {
			System.out.println("()");
			
		}
		else System.err.println("()");
	}

}
