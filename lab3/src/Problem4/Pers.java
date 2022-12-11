package Problem4;

import java.util.Date;

public class Pers {
	String name;
	int phoneNum;
	Date dateAdvertisement;
	private String address;
	
	public Pers(String name, int phoneNum,String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		}
	public Pers(String name, int phoneNum,String address,Date dateAdvertisement) {
		this(name, phoneNum, address);
		this.dateAdvertisement = dateAdvertisement;	
		
		}
	
	public void setAddress() {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(this == null) return false;
		Pers p = (Pers) o;
		return super.equals(o) && this.name.equals(p.name) && `
				phoneNum == p.phoneNum;
	}
		
	public Object clone() throws CloneNotSupportedException{
		Pers copy = (Pers)super.clone();
		copy.dateAdvertisement = (Date)dateAdvertisement.clone();
		return copy;
	}
	
	public String Hello() {
		return "Hello this is Krysha.kz";
	}
	public String toString() {
		return "name: " + name + " phone number: " + phoneNum + " address of apartment: " + address;
	}
}
