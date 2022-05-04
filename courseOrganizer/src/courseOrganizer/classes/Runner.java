package courseOrganizer.classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Course> courses = new HashMap<>();
         
        //courses = inputCoursesData();
        courses = hardcodedCoursesData();
        
        // Print Courses data
        System.out.println("Courses data:");
        int userId = 123;
        User user_1 = new User(userId,courses);
      
        double avg = user_1.averageScore();
        double standardDeviation = user_1.calculateSD(courses);

        System.out.println(user_1);
        System.out.println("Average grade: " + avg);
        System.out.println("Standard deviation: " + standardDeviation);
    }
	
	public static HashMap<Integer, Course> hardcodedCoursesData()
	{
		HashMap<Integer, Course> courses = new HashMap<>();
		
        Course myCourse_1 = new Course("Java",5,"BJN",100);
        Course myCourse_2 = new Course("Phyton",1,"TAU",90);
        Course myCourse_3 = new Course("C++",2,"Experss",85);
        Course myCourse_4 = new Course("C#",4,"Open Unv.",70);
        Course myCourse_5 = new Course("Matlab",3,"TAU",60);
        
        courses.put(myCourse_1.getNumberId() ,myCourse_1);
        courses.put(myCourse_2.getNumberId() ,myCourse_2);
        courses.put(myCourse_3.getNumberId() ,myCourse_3);
        courses.put(myCourse_4.getNumberId() ,myCourse_4);
        courses.put(myCourse_5.getNumberId() ,myCourse_5);
        
        return courses;
	}
	
	public static HashMap<Integer, Course> inputCoursesData()
	{
		HashMap<Integer, Course> courses = new HashMap<>();
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
                courses.put(newId,myCourse);

                sc.nextLine();
            }

        } while(!newCourse.equals(""));
    
        return courses;
	}
	
	
	
	
}
