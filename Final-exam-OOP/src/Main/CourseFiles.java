package Main;

import java.io.Serializable;

public class CourseFiles implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;
	private Teacher owner;
	private Course course;
	
	public CourseFiles(String fileName, Teacher owner, Course course) {
		super();
		this.fileName = fileName;
		this.owner = owner;
		this.course = course;
	}
	//------------------------------------------------------------

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Teacher getOwner() {
		return owner;
	}

	public void setOwner(Teacher owner) {
		this.owner = owner;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	//--------------------------------------------------------------------
	/**
	 * this method displays files of disciplines
	 */
	public String showFileInfo() {
		return "File name:"+fileName+"Owner: "+owner+"Course: "+course;
	}
	@Override
	public String toString() {
		return "CourseFiles [fileName=" + fileName + ", course=" + course + "]";
	}
	
}
