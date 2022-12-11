package Lab1;

public class Temp3 {
	String scale;
	double tempValue;
	public Temp3() {	
		scale = "C";
		tempValue = 0;	
	}
	public Temp3(String scale) {
		this.scale = scale;	
//		scale = "C";
	}
	public Temp3(String scale, double tempValue) {
		this(scale);
		this.tempValue = tempValue;	
	}
	
	public static double ToFah(double tempValue) {
		double degreeF = (9*(tempValue/5))+32;
		return degreeF;
		
	}
	
	public double ToCel(double tempValue) {
		double degreeC = (5*(tempValue-32))/9;
		return degreeC;
	}
	
	public void setValue(double tempValue) {
		if(scale == "C") {
			this.tempValue = ToCel(this.tempValue);
	}
		else if(scale == "F") {
			this.tempValue = ToFah(this.tempValue);
		}
		
		
	}
	public void setScale(String scale) {
		if(this.scale == scale) {
			this.scale = scale;
		}
		else {
			this.scale = scale;
			setValue(this.tempValue);
		}
	
	}
	
	public String toString() {
		
		return this.tempValue + " " + this.scale;
	}
}