/**
 * Student name:        Fazeli, Bijan
 * CRN # :              25398
 *  Course:             CS 170
 *  Semester:           Fall 2015
 *  Date:               11/29/15
 *
 *  Chapter#:           08
 *  ProjectName:        DoctorTest
 *  File/Class name:    DoctorTest.java
 *  
 *  Concepts used:      Made use of inherting methods from other classes 
 *                      while problem solving using loops to cycle through an array of objects. 
 *                      Commented the document source code for clarity.
 *
 *  Program Statement:  This program tests inheritance between Person and Doctor classes.
 *  
 *  Assumptions:        Value entered from the user follows the instuctions.
 */

public class DoctorTest
{
    //Create an array of Doctor objects and call it doctors
    public static Doctor[] doctors = {new Doctor(), 
                                      new Doctor("Jakyll", "Psychologist"), 
                                      new Doctor("Holiday", 200.99, "General Practitioner"),
                                      new Doctor("Yes", 950.00, "None given.")};
    //Create an array of Strings that hold first and second as values and call it order
    public static String[] doctorNames = {"Doctor No - Using default constructor...\n", 
                                          "Doctor Jekyll - Using constructor with no office fees...\n",
                                          "Doctor Holiday - Constructor with name, office fee, and specialty :\n",
                                          "Doctor Yes - Constructor with name, office fee, and specialty :\n"};
                                          
    //Main method
    public static void main() {
        //Display program purpose
        System.out.println("This program tests inheritance between Person and Doctor classes.");
        
        //Call the objectsInfo method to display results for each doctor
        objectsInfo();
        
        //Call the testHoliday method to check that all the accessor methods work correctly for Doctor Holiday
        testHoliday();
        
        //Call the testNo method to check that a few setter methods work correctly for Doctor No
        testNo();
        
        //Call the testOfficeFeeGetter method
        testOfficeFeeGetter();
        
        //Call the equalsTest method
        equalsTest();
        
        //Display end of program statement
        System.out.println("\nEnd of Program. Good Bye!");
    }
    
    
    //Create an objectInfo() method
    public static void objectsInfo() {        
        //Create a for-loop to cycle through the doctors array display the results.
        for(int i = 0; i < 3; i++) {
            System.out.println(doctorNames[i] + "Verify that Name: " + doctors[i].getName() + ", Office Fees: $" + doctors[i].getOfficeFee() + 
                               ", and Specialty: " + doctors[i].getSpecialty());
            doctors[i].printInfo();
            System.out.println("=======================================");
        }
    }
    
    //Create a getHoliday() method to test the gitters of Dr. Holiday object
    public static void testHoliday(){
        System.out.println("Testing get method getName() for Dr. Holiday ..." +
                           "\nName: " + doctors[2].getName() +
                           "\n=======================================" +
                           "\nTest getOfficeFee() method for Dr. Holiday ..." +
                           "\nVerify that his office fees are $209.99" +
                           "\nOffice fees: " + doctors[2].getOfficeFee() +
                           "\n=======================================" +
                           "\nTest getSpecialty() method for Dr. Holiday ..." +
                           "\nVerify that he is a General Practitioner" +
                           "\nSpecialty: " + doctors[2].getSpecialty() +
                           "\n=======================================");
    }
    
    
    public static void testNo(){
        System.out.println("Testing set methods for Dr No" +
                           "\nSet setOfficeFee() to 1234.56 and setSpecialty() to Laser Surgery ..." +
                           "\nDefault parameter values before set:");
        doctors[0].printInfo();
        
        //Set new values for officeFee and specialty and display results
        System.out.println("Verify that after set: Name: No name yet., Office fees: $1234.56, and Specialty: Laser Surgery");
        doctors[0].setOfficeFee(1234.56);
        doctors[0].setSpecialty("Laser Surgery");
        doctors[0].printInfo();
        System.out.println("=======================================");
    }
    
    
    public static void testOfficeFeeGetter(){
        System.out.println("Using getOfficeFee() method for Dr. No ..." + 
                           "\nVerify that office fees: $1234.65, and Specialty: Laser Surgery" +
                           "\nOffice fees: " + doctors[0].getOfficeFee() +
                           "\nSpecialty: " + doctors[0].getSpecialty() +
                           "\n=======================================");
    }
    
    public static void equalsTest(){
        //Test1
        //Display Dr. No's contents and give doctor yes's specialty the same as Dr. No and display the contents
        System.out.println("Testing equals() method - test 1..." +
                           "\nFirst Doctor No's parameter values:");
        doctors[0].printInfo();
        System.out.println("\nCreate Doctor Yes object (overloaded Constructor) that has the same specialty as Dr. No..." +
                           "\nDoctor Yes's values using pringInfo()");
        doctors[3].setSpecialty(doctors[0].getSpecialty());
        doctors[3].printInfo();
        
        //Test if Dr. No is equal to Dr. Yes pt1
        System.out.println("Test equality - Verify that the result is false" +
                           "\nEquality test result is: " + doctors[0].equals(doctors[3]) +
                           "\n=======================================");
        
        //Test2
        //Assign the officeFee property of Dr. Yes the same value as Dr. No and display contents
        doctors[3].setOfficeFee(doctors[0].getOfficeFee());
        System.out.println("Testing equals() method - test 2..." +
                           "\nChange office fee of Dr Yes to be equal to those of Dr No" +
                           "\nFirst Doctor's parameter values:");
        doctors[0].printInfo();
        System.out.println("Second Doctor's parameter values:");
        doctors[3].printInfo();
        
        //Test if Dr. No is equal to Dr. Yes pt2
        System.out.println("Test equality - Verify that the result is false" +
                           "\nEquality test result is: " + doctors[0].equals(doctors[3]) +
                           "\n=======================================");
                           
        //Test3
        System.out.println("Testing equals() method - test 3..." +
                           "\nComparing Dr. Jekyll with himself" +
                           "\nFirst Doctor No's parameter values:");
        doctors[1].printInfo();
        System.out.println("\nSecond Doctor's parameter values:");
        doctors[1].printInfo();
        
        //Test if Dr. Jekyll is equal to Dr. Jekyll
        System.out.println("Test equality - Verify that the result is true" +
                           "\nEquality test result is: " + doctors[1].equals(doctors[1]) +
                           "\n=======================================");
    }
}