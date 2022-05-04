package courseOrganizer.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner 
{
	public static void main(String[] args) 
	{
		HashMap<String, Double> courses = new HashMap<>();
         
        //courses = inputCoursesData();
        courses = hardcodedCoursesData();
        
        // Print Courses data
        System.out.println("Courses data:");
        double sum = 0.0;
        
        for (Map.Entry<String, Double> oneCourse : courses.entrySet()) 
        {
            System.out.println(oneCourse.getKey() + " (" + oneCourse.getValue() + ")");
            sum += oneCourse.getValue();
        }

        double avg = sum / courses.size();
        double standardDeviation = calculateSD(courses);
        
       // int userId = 123;
       // User user_1 = new User(userId,courses);
       // System.out.println(user_1);
        System.out.println("Average grade: " + avg);
        System.out.println("Standard deviation: " + standardDeviation);
    }
	
	public static HashMap<String, Double> hardcodedCoursesData()
	{
		HashMap<String, Double> courses = new HashMap<>();
		
        Course myCourse_1 = new Course("Java",12,"BJN",100);
        Course myCourse_2 = new Course("Phyton",50,"TAU",90);
        Course myCourse_3 = new Course("C++",51,"Experss",85);
        Course myCourse_4 = new Course("C#",15,"Open Unv.",70);
        Course myCourse_5 = new Course("Matlab",100,"TAU",60);
        
        courses.put(myCourse_1.getName() ,myCourse_1.getGrade());
        courses.put(myCourse_2.getName() ,myCourse_2.getGrade());
        courses.put(myCourse_3.getName() ,myCourse_3.getGrade());
        courses.put(myCourse_4.getName() ,myCourse_4.getGrade());
        courses.put(myCourse_5.getName() ,myCourse_5.getGrade());
        
        return courses;
	}
	
	public static HashMap<String, Double> inputCoursesData()
	{
		HashMap<String, Double> courses = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String newCourse;
	    System.out.println("Enter your course data (or ENTER to finish):");

        // Get student course data and grades
        do {

            System.out.print("Course name: ");
            newCourse = sc.nextLine();

            if (!newCourse.equals("")) 
            {
            	System.out.print("Course number: ");
                int newId = sc.nextInt();
                
                System.out.print("School name: ");
                String schoolName = sc.next();
                
                System.out.print("The grade:\n");
                double newGrade = sc.nextDouble(); 
                
                Course myCourse = new Course(newCourse,newId,schoolName,newGrade);     
                courses.put(newCourse,newGrade);

                sc.nextLine();
            }

        } while(!newCourse.equals(""));
    
        return courses;
	}
	
	public static double calculateSD(HashMap<String, Double> courses)
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = courses.size();

        for (Map.Entry<String, Double> oneCourse : courses.entrySet()) 
        {
        	sum += oneCourse.getValue();
        }

        double mean = sum/length;

        for (Map.Entry<String, Double> oneCourse : courses.entrySet()) 
        {
            standardDeviation += Math.pow(oneCourse.getValue() - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
	
	public void printCoursesData(HashMap<String, Double> courses) 
	{
		
	
	}
}
