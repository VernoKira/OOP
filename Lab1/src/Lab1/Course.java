package Lab1;

public class Course {
	public String name;
	public String description;
	public int numOfCredits;
	public String prereq;
	
	
	
	public Course(String name, String description, int numOfCredits, String prereq) {
		this.name = name;
		this.description = description;
		this.numOfCredits = numOfCredits;
		this.prereq = prereq;
	}
	
	
	public String toString() {
		return "Course:" + name +
			   "Description: " + description + 
			   "Number of credits: " + numOfCredits + 
			   "Prerequisite: " + prereq;
	}
}
