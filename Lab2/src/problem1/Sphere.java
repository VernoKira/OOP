package problem1;

public class Sphere extends Shape {

	int r=10;
	public void Volume() {
		int vol = (int) ((4/3)*Math.pow(r, 3)*Math.PI);
		System.out.println("Volume of sphere: " + vol);
	}

	public void SurfaceArea() {
		int area = (int) (Math.PI*Math.pow(r, 2)*4);
		System.out.println("Surface area of sphere: " + area+"\n");
		
	}
	

}
