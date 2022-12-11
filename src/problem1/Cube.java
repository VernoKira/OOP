package problem1;

public  class Cube extends Shape{
	int x =3;
	public void Volume() {
		int vol = (int) Math.pow(x, 3);
		System.out.println("Volume of cube: " + vol);
	}
	
	public void SurfaceArea() {
		int area = 6*(int)Math.pow(x,2);
		System.out.println("Area of cube: "+area+"\n");

	}
}
