package problem1;

public class Cylinder extends Shape{
	int r=5;
	int h=10;
	public void Volume() {
		int vol = (int) (Math.PI * Math.pow(r, 2)*h);
		System.out.println("Volume of cylinder: " + vol);
		
	}
	public void SurfaceArea() {
		int area = (int)(2*Math.PI*r*(r+h));
		System.out.println("Surface area of cylinder: " + area+"\n");
	}
	

}
