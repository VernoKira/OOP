package Lab1;

import practice2.Student;


public class GradeBook4 {
	Course course;
	Student student;
	
	private double average;
	private double maximum;
	private double minimum;
	private int cnt;

	private int idOfMax;
	private int idOfMin;
	private String nameOfMax;
	private String nameOfMin;
	
	private int[] grades = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};



	public GradeBook4(Course course) {
		this.course = course;
	}

	
	public void  displayMessage() {
		System.out.println("Welcome to the grade book for " + course.name + ": " + course.description + "!" );
		System.out.println( "\r"+"Please, input grades for students: ");
	}
	
	public void addStudent(String name, int studentId, int number) {
		
		this.average += number;
		cnt++;
		
		setMaximum(name, studentId, number);
		setMinimum(name, studentId, number);
		
		grades[(number / 10)] += 1;
	}

	public void setMaximum(String name,int studentId, int number) {
		if(maximum < number) {
			maximum = number;
			idOfMax = studentId;
			nameOfMax = name;
		}else if(this.cnt == 1) {
			maximum = number;
			idOfMax = studentId;
			nameOfMax = name;
		}
	}
	
	public void setMinimum(String name, int studentId, int number) {
		if(minimum > number) {
			minimum = number;
			idOfMin = studentId;
			nameOfMin = name;
		}else if(this.cnt == 1) {
			minimum = number;
			idOfMin = studentId;
			nameOfMin = name;
		}
	}
	

	
	public double determineClassAverage() {
		if(average != 0) {
			return(average / cnt);
		}else {
			return 0;
		}
	}
	
	
	
	public String toString() {
		return "\r"+"Class average is " + determineClassAverage() + 
			   ". Lowest grade is " + minimum + " (" +idOfMin + " " + nameOfMin + ")." +
			   "\n" +
			    "Highest grade is " + maximum + " (" + idOfMax + " " + nameOfMax + ").";
	}
	
	public String outputBarChart() {
		String barChart = "";
		
		for (int i = 0; i < 11; i++) {
			if(i < 10) {
				barChart += i + "0-" + i  +"9:";
			}
			else if(i == 10) {
				barChart += i +"0:";
			}
		
			if(grades[i] != 0) {
				barChart += "*".repeat(grades[i]);
			}
			
			barChart += "\r\n";
		}
		
		return "\n" + "Grades distribution:" + "\n" + barChart;
	}

	public String displayGradeReport() {
		return this.toString() + "\n" + this.outputBarChart();
	}

}
