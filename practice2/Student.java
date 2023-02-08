package practice2;

import java.util.Vector;

public class Student{
	public String name;
	public int course = 2;
	public String id;
	
	public static Vector <Student> students;
	static {
		students = new Vector<Student>();
	}
	{
		students.add(this);
	}
	public Student() {
		
	}
	
	
	
	public Student(String name) {
		this.name = name;
		
	}
	public Student(String name, String id) {
		this(name);
		this.id = id;
	}
	void setName(String name) {
		this.name = name;
	}
	void setId(String id) {
		this.id = id;
	}

}
