package Main;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map.Entry;

public class Mark implements Serializable{
	
	private Course courseName;
	private double att1;
	private double att2;
	private double finalPoint;
	private double totalPoints;
	private double GPAforCourse;
	private double score;
	
	private double averageGPA;
	private int numberOfCredit;
	private HashMap<Integer,HashMap<Course,Mark> > semesters = new HashMap<Integer,HashMap<Course,Mark> >();
	
	
	
	public Mark(Course courseName, double score, double totalPoints) {
		this.courseName = courseName;
		this.score = score;
		this.totalPoints = totalPoints;
	}
	
	public Mark(double score, String str) {
		this.score = score;
		if (str.equals("att1"))
			this.setAtt1(score);
		else if (str.equals("att2"))
			this.setAtt2(score);
		else
			this.setFinalPoint(score);
			
	}
//--------------------------------------------------------
	public double getAverageGPA() {
		return averageGPA;
	}
	public void setAverageGPA(double averageGPA) {
		this.averageGPA = averageGPA;
	}
	
	
	public Course getCourseName() {
		return courseName;
	}

	public void setCourseName(Course courseName) {
		this.courseName = courseName;
	}

	public double getAtt1() {
		return att1;
	}

	public void setAtt1(double att1) {
		this.att1 = att1;
		totalPoints += att1;
	}

	public double getAtt2() {
		return att2;
	}

	public void setAtt2(double att2) {
		this.att2 = att2;
		totalPoints += att2;
	}

	public double getFinalPoint() {
		return finalPoint;
	}

	public void setFinalPoint(double finalPoint) {
		this.finalPoint = finalPoint;
		totalPoints += finalPoint;
	}

	public double getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}

	public double getGPAforCourse() {
		return GPAforCourse;
	}

	public void setGPAforCourse(double gPAforCourse) {
		GPAforCourse = gPAforCourse;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	//-----------------------------------------------
	
	public void calculateGPA() {
		double cnt = 0;
		int numCourse = 0;
		for (int i = 0; i < semesters.size(); i++){
			for (Entry<Course, Mark> m: semesters.get(i).entrySet()) {
				numCourse += 1;
				cnt += m.getValue().getGPAforCourse();
			}
		}
		averageGPA = cnt/numCourse;
	}
	public void putMark(int semester, Course course, Mark mark) {
		semesters.get(semester).put(course,mark);
		numberOfCredit += course.getCredits();
		calculateGPA();
	}
	public String showInfo() {
		String str = "";
		str += "Average GPA: "+this.averageGPA;
		for (int i = 1; i <= semesters.size();i++) {
			str += "\nMark for "+i+"semester\n";
			for (HashMap.Entry<Course,Mark> crs: semesters.get(i).entrySet()) {
				str += (crs.getKey()+ ": "+crs.getValue())+"\n";
			}
		}
		return str;
	}
	
	
	
	public void updateMark(double score) {
		this.score += score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalPoints);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark other = (Mark) obj;
		return Double.doubleToLongBits(totalPoints) == Double.doubleToLongBits(other.totalPoints);
	}
	
}
