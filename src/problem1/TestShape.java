package problem1;
public class TestShape {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.Volume();
		c.SurfaceArea();
		Shape s2 = new Cylinder();
		
		Sphere s = new Sphere();
		s.Volume();
		s.SurfaceArea();
		
		Cube cube = new Cube();
		cube.Volume();
		cube.SurfaceArea();
				
	}

}
