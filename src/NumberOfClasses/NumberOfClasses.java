/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberOfClasses;

//this line of code is needed for scanner
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class NumberOfClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) 
    {
        //declare the variables for # of courses and course names
        String firstCourse; // variable for first course
        String secondCourse; // variable for second course
        int numberOfCourses; //variable for number of courses
        
        //create a scanner object to read input
        Scanner keyboard = new Scanner (System.in);
        
        // Get the user's number of courses
        System.out.print("How many courses are you taking this semester? ");
        numberOfCourses = keyboard.nextInt();
        
        //Get the users first course
        System.out.print("What is the name of your first course? ");
        firstCourse = keyboard.next();
        
        // Consume the remaining newLine
        keyboard.nextLine();
        
        //Get the users second co urse
        System.out.print("What the name of your second course? ");
        secondCourse = keyboard.nextLine();
        
        //Display the info back to user
        System.out.println("You are taking " + numberOfCourses + " courses." +
                        " The name of the first course is: " + firstCourse + 
                        "  and the name of the second course is: "
                        + secondCourse + ".");
        }
    
}
