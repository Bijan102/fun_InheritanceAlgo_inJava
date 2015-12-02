/**
 * Student name:        Fazeli, Bijan
 * CRN # :              25398
 *  Course:             CS 170
 *  Semester:           Fall 2015
 *  Date:               11/02/15
 *
 *  Chapter#:           08
 *  ProjectName:        FacultyTest
 *  File/Class name:    FacultyTest.java
 *  
 *  Concepts used:      Used variables to store values using keyboard input, and made use of methods 
 *                      while problem solving using loops to go through an array of objects. 
 *                      Commented the document source code for clarity.
 *
 *  Program Statement:  This program gets and displays full-time and part-time faculty information
 *  
 *  Assumptions:        Value entered from the user follows the instuctions.
 */


//import java library
import java.util.Scanner;

public class FacultyTest
{
    //Create an array of FullTimeFaculty objects and call it fullTime
    public static FullTimeFaculty[] fullTime = {new FullTimeFaculty(), new FullTimeFaculty()};
    //Create an array of PartTimeFaculty objects and call it partTime
    public static PartTimeFaculty[] partTime = {new PartTimeFaculty(), new PartTimeFaculty()};
    //Create an array of Strings that hold first and second as values and call it order
    public static String[] order = {"first", "second"};
    //Create a Scanner object 'kb' to accept user input
    public static Scanner kb = new Scanner(System.in);
    
    
    //Main method
    public static void main() {
        //Display program purpose
        System.out.println("This program gets and displays full-time and part-time faculty information");
        
        //Call the recieveAndDisplay_ft method to get user's input and display results for each full-time faculty
        recieveAndDisplay_ft();
        
        //Call the recieveAndDisplay_pt method to get user's input and display results for each full-time faculty
        recieveAndDisplay_pt();
        
        //Display end of program statement
        System.out.println("\nEnd of Program. Good Bye!");
    }
    
    
    //Create a recieveAndDisplay_ft method
    public static void recieveAndDisplay_ft() {        
        /*Create a for-loop to cycle through the fullTime array and get the user's input 
        for the name, ssn, and salary of the current object and display the results.*/
        for(int i = 0; i < fullTime.length; i++) {
            System.out.print("Enter the name for the " + order[i] + " full-time faculty: ");
            fullTime[i].setName(kb.next());
            System.out.print("Enter the SSN for the " + order[i] + " full-time faculty: ");
            fullTime[i].setSSN(kb.nextInt());
            System.out.print("Enter the salary for the " + order[i] + " full-time faculty: ");
            fullTime[i].setSalary(kb.nextDouble());
            
            System.out.println("The information about Full-time faculty " + (i + 1) + " is as follows:");
            fullTime[i].print();
            System.out.println("\n");
        }
        
        //Check for equality of the first and second ft object by calling the equals method 
        System.out.printf("Checking for equality: \nThe fact that FT1 and FT2 are the same is: %9s\n",
                          fullTime[0].equals(fullTime[1]));
    }
    
    
    //Create a recieveAndDisplay_pt method
    public static void recieveAndDisplay_pt() {
        /*Create a for-loop to cycle through the partTime array and get the user's input 
        for the name, ssn, and salary of the current object and display the results.*/
        for(int i = 0; i < partTime.length; i++) {
            System.out.print("Enter the name for the " + order[i] + " part-time faculty: ");
            partTime[i].setName(kb.next());
            System.out.print("Enter the SSN for the " + order[i] + " part-time faculty: ");
            partTime[i].setSSN(kb.nextInt());
            System.out.print("Enter the hourly wage for the " + order[i] + " part-time faculty: ");
            partTime[i].setHourlyWage(kb.nextDouble());
            
            System.out.println("The information about part-time faculty " + (i + 1) + " is as follows:");
            partTime[i].print();
            System.out.println("\n");
        }
        
        //Check for equality of the first and second pt object by calling the equals method 
        System.out.printf("Checking for equality: \nThe fact that FT1 and FT2 are the same is: %9s\n",
                          partTime[0].equals(partTime[1]));
    }
}