package Lab1;

public class Data1 {
	private double avarage;
	private double max;
	private int num1;
	int cntNum;

	public Data1(int num1) {
		this.num1 = num1;
		
	}
	public void setNum(int num1) {
		this.num1 = num1;
		setAvarage();
		setMax();
	}
	
	
	public void setAvarage() {
		avarage+= num1;
		cntNum++;
	}
		
	public void setMax() {
		if(max < num1) {
			max = num1;
		}
	}
	public double getAvarage() {
		return (avarage/cntNum);
		
	}
	public double getMax() {
		return max;
	}
	
	public String toString() {
		return "Avarage= " + this.getAvarage() + "\n"+ "Maximum= " + this.getMax();
	}

}