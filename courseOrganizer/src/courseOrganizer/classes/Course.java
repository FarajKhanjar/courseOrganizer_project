package courseOrganizer.classes;

public class Course 
{
	protected String name;




	protected int numberId;
	protected String schoolName;
	protected double grade;
	
	public Course(String name, int numberId, String schoolName, double grade) 
	{
		this.name = name;
		this.numberId = numberId;
		this.schoolName = schoolName;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public int getNumberId() {
		return numberId;
	}

	public void setNumberId(int numberId) {
		this.numberId = numberId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	
	public void  printCoursesData() 
	{
		System.out.println("[name=" + name + ", numberId=" + numberId + ", schoolName=" + schoolName + ", grade=" + grade+ "]");

	}
	
	

}
