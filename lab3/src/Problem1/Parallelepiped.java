package Problem1;

public class Parallelepiped extends Shape implements Volume{
	int a,b,c;
	
	Parallelepiped(int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c= c;
	}
	
	@Override
	double getArea() {
		return 2*(a*b+a*c+b*c);
	}

	@Override
	double Perimeter() {
		return 4*(a+b+c);
	}

	@Override
	public double getVolume() {
		return a*b*c;
	}

	@Override
	public String toString() {
		return "Parallelepiped[getArea()=" + getArea() + ", Perimeter()=" + Perimeter() + ", getVolume()=" + getVolume() + "]";
	}
	
}
