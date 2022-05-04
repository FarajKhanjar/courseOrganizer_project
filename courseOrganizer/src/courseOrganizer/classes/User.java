package courseOrganizer.classes;

import java.util.HashMap;

public class User 
{
	protected int userId;
	HashMap<String, Double> courses = new HashMap<>();
	
	public User(int userId, HashMap<String, Double> courses) 
	{
		this.userId = userId;
		this.courses = courses;
	}

	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", courses=" + courses + "]";
	}

}
