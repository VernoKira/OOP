package lecture;
import java.util.*;
public class Test extends Shape {
	public static void main(String [] args) {
		
		Vector <Shape> shapes = new Vector <Shape>();
		shapes.add(new Circle(Color.RED,4));
		for(Shape s: shapes)
			s.draw();
	}

}
