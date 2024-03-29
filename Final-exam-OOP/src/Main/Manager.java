package Main;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

import Enums.Type;
import Interfaces.AddRemoveStudent;
import Interfaces.viewInformation;

public class Manager extends Employee implements AddRemoveStudent,viewInformation{
	
	private Type managerType;
	
	
	public Manager(String name, String surname, String id, Date birthDay,String phoneNumber, String email,
			int workExperience,Type managerType) {
		super(name,surname,id,birthDay,phoneNumber,email,workExperience);
		this.managerType = managerType;
	}
	public Manager(String name, String surname, String id, Date birthDay, String phoneNumber, String email, Date hireDate,
			int salary, String insuranceNumber, int prize, int workExperience, Type managerType) {
		super(name, surname, id, birthDay, phoneNumber, email, hireDate, salary, insuranceNumber, prize,
				workExperience);
		this.managerType = managerType;
	}
//----------------------------------------------------------------------------------------------------
	public Type getManagerType() {
		return managerType;
	}

	public void setManagerType(Type managerType) {
		this.managerType = managerType;
	}
//---------------------------------------------------------------------------------------------------------
	/**
	 * here manager sees courses chosen by student 
	 */
	public String viewForCourse(String courseID) {
    	String str = "";
    	for (Course usr: Database.courses) {
    		if (usr instanceof Course) {
    			Course std = (Course)usr;
    			if (std.getCourseCode().equals(courseID)) {
    				str += std.showInfo()+"\n";
    			}
    		}
    	}
    	return str;
    }
	/**
	 * here manager can see student's transcript 
	 */
	public String viewTranscript(String studentID) {
    	for (User usr: Database.users) {
    		if (usr instanceof Student) {
    			Student std = (Student)usr;
    			if (std.getId().equals(studentID)) {
    				return std.viewTranscript();
    			}
    		}
    	}
        return "There is no information";
    }
	/**
	 * here manager sees attendance of courses 
	 */
	public String viewAttendance(String studentID, String courseCode) {
    	for (User usr: Database.users) {
    		if (usr instanceof Student) {
    			Student std = (Student)usr;
    			if (std.getId().equals(studentID)) {
    				for (Course crs: std.getCourses()) {
    					if (crs.getCourseCode().equals(courseCode)) {
    						return crs.showAttendance();
    					}
    				}
    			}
    		}
    	} 
    	return "Empty attendance list";
    }
	/**
	 * the manager is the only person who can announce the news and this method creates the news
	 */
	public void createNews(String text) {
		News nw = new News(text,this);
		Database.news.add(nw);
	}
	/**
	 * this method displays private information about student for manager  
	 */
	public String viewPrivateInformation(String userID) {
		for (User usr: Database.users) {
    		if (usr instanceof Student) {
    			Student std = (Student)usr;
    			if (std.getId().equals(userID)) {
    				return std.viewPrivateInformation();
    			}
    		}
    	}
		for (User usr: Database.users) {
    		if (usr instanceof Teacher) {
    			Teacher std = (Teacher)usr;
    			if (std.getId().equals(userID)) {
    				return std.showInfo();
    			}
    		}
    	}
        return "There is no information";
    }
	/**
	 * here manager adds student to disciplines 
	 */
	public boolean addStudentToCourse(String studentID, String courseCode) {
    	for (User usr: Database.users) {
    		if (usr instanceof Student) {
    			Student std = (Student)usr;
    			if (std.getId().equals(studentID)) {
    				for (Course crs: std.getCourses()) {
    					if (crs.getCourseCode().equals(courseCode)) {
    						std.getCourses().add(crs);
    						return true;
    					}
    				}
    			}
    		}
    	}
        return false;
    }

	/**
	 * here manager removes students from disciplines 
	 */
    public boolean removeStudentFromCourse(String studentID, String courseCode) {
    	for (User usr: Database.users) {
    		if (usr instanceof Student) {
    			Student std = (Student)usr;
    			if (std.getId().equals(studentID)) {
    				for (Course crs: std.getCourses()) {
    					if (crs.getCourseCode().equals(courseCode)) {
    						std.getCourses().remove(crs);
    						return true;
    					}
    				}
    			}
    		}
    	}
        return false;
    }
    public boolean addTeacherToCourse(String thID, String courseCode) {
    	for (User usr: Database.users) {
    		if (usr instanceof Teacher) {
    			Teacher th = (Teacher)usr;
    			if (th.getId().equals(thID)) {
    				for (Course crs: th.getLessons()) {
    					if (crs.getCourseCode().equals(courseCode)) {
    						th.getLessons().add(crs);
    						return true;
    					}
    				}
    			}
    		}
    	}
        return false;
    }
    /**
     * using this method manager sees files of courses
     */
	 public String viewCourseFiles(String teacherID) {
	    	String str ="";
	    	for (User usr: Database.users) {
	    		if (usr instanceof Teacher) {
	    			Teacher th = (Teacher)usr;
	    			if (th.getId().equals(teacherID)) {
	    				str += th.viewCourseFiles();
	    				return str;
	    			}
	    		}
	    	}
	    	return "File is emtpy";
	}
	 /**
		 * this method allows create new course
		 */
	 public boolean createCourse(String courseName, int credits, String courseCode) {
		 Course crs = new Course(courseName, credits, courseCode);
	    	for (Course course: Database.courses) {
	        	if (!course.getCourseCode().equals(courseCode)) {
	        		Database.courses.add(crs);
	        		return true;
	        	}
	    	}
	    	return false;
	 }
	 /**
	  * here manager sees statistic of students(e.g. who has high GPA and etc.)
	  */
	 public String showStatistic() {
		 String numberofStudent = "";
		 String numberofTeacher = "";
		 String top3StudentbyGPA = "";
		 String top3TeacherbyRating = "";
		 String worst3StudentbyGPA = "";
		 
		 int cnt1 = 0;
		 for (User usr: Database.users) {
	    		if (usr instanceof Student) {
	    			cnt1++;	    			
	    		}
		 }
		 numberofStudent = Integer.toString(cnt1);
		 int cnt2 = 0;
		 for (User usr: Database.users) {
	    		if (usr instanceof Teacher) {
	    			cnt2++;	    			
	    		}
		 }
		 numberofStudent = Integer.toString(cnt2);
		 
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 Vector<Student> st = new Vector<Student>();
		 for (User user: Database.users) {
	            if(user instanceof Student) {
	                st.add((Student) user);
	            }
	     }
	        st.sort(new SortGPA());
	        for (User usr : st) {
				Student stt = (Student)usr;
	            i++;
	            if (i > 3)
	            	break;
	            top3StudentbyGPA +=
	                i + ")  Student Name: " + stt.getName()
	            + "\n    Student surname: " + stt.getSurname() 
	            + "\n    ID: " + stt.getId()
	            + "\n    GPA: " + stt.getGPA() 
	            + "\n\n";
	       }
	       
	       Collections.reverse(st);
	       for (User usr : st) {
				Student stt = (Student)usr;
	            j++;
	            if (j > 3)
	            	break;
	            worst3StudentbyGPA +=
	                j + ")  Student Name: " + stt.getName()
	            + "\n    Student surname: " + stt.getSurname() 
	            + "\n    ID: " + stt.getId()
	            + "\n    GPA: " + stt.getGPA() 
	            + "\n\n";
	       }
	      
	       Vector<Teacher> th = new Vector<Teacher>();
			 for (User user: Database.users) {
		            if(user instanceof Teacher) {
		                th.add((Teacher) user);
		            }
		     }
		        th.sort(new SortRating());
		        for (User usr : th) {
					Teacher thh = (Teacher)usr;
		            k++;
		            if (k > 3)
		            	break;
		            top3TeacherbyRating +=
		                k + ")  Teacher Name: " + thh.getName()
		            + "\n    Teacher surname: " + thh.getSurname() 
		            + "\n    ID: " + thh.getId()
		            + "\n    Rating: " + thh.getRating() 
		            + "\n\n";
		       }
		     return "Number of Student in system: \n"+numberofStudent +"\nNumber of Teacher in system: \n"+ numberofTeacher+
		    		 "\nTop 3 Students by GPA: \n"+top3StudentbyGPA+"\nTop 3 Teacher by rating: \n"+top3TeacherbyRating
		    		 +"\nWorst 3 Student by GPA: "+worst3StudentbyGPA;
		 		 
	 }
	 /**
	  * this method shows information about manager
	  */
	 public String showInfo() {
		 return "Name: "+this.getName()+"\nSurname: "+this.getSurname()+
				 "\nManager id: "+this.getId()+"\nType: "+this.getManagerType();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(managerType);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return managerType == other.managerType;
	}
	@Override
	public String toString() {
		return "Manager [managerType=" + managerType + "]";
	}
	

	
	
}
