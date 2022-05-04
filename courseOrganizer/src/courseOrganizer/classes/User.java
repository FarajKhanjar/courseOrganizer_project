package courseOrganizer.classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class User 
{
	protected int userId;
	HashMap<Integer, Course> courses ;
	
	public User(int userId, HashMap<Integer, Course> courses) 
	{
		this.userId = userId;
		this.courses = courses;
	}
	
	public double averageScore() 
	{
		Collection<Course> allCourses = courses.values();
	    double sum = 0;
		for (Course oneCourse : allCourses) 
	    {
	        sum += oneCourse.getGrade();
	    }		
		double avg = sum / courses.size();
		return avg;
	}
	
	public static double calculateSD(HashMap<Integer, Course> courses)
    {
        double sum = 0, standardDeviation = 0.0;
        int length = courses.size();

        for (Course oneCourse : courses.values()) 
        {
        	sum += oneCourse.getGrade();
        }

        double mean = sum/length;

        for (Course oneCourse : courses.values()) 
        {
            standardDeviation += Math.pow(oneCourse.getGrade() - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
	

	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", courses=" + courses + "]";
	}

}
