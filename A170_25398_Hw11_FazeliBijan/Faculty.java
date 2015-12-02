/**
 * Student name:        Fazeli, Bijan
 * CRN # :              25398
 *  Course:             CS 170
 *  Semester:           Fall 2015
 *  Date:               11/30/15
 *
 *  Chapter#:           08
 *  ProjectName:        Faculty
 *  File/Class name:    Faculty.java
 *  
 *  Concepts used:      Created overloaded constructors and methods for object instantiation
 *
 *  Program Statement:  A class to be used in the main method
 *  
 *  Assumptions:        No assumptions needed.
 */

public class Faculty
{
    // instance variables - replace the example below with your own
    private int ssn;
    private String name;
    
    /**
     * Defualt Constructor using this() to call the 2-argument constructor
     */
    public Faculty()
    {
        // initialise instance variables
        this(0, "N/A");
    }

    /**
     * <strong>Overloaded Constructor</strong>
     * <ul><li><strong>Action:</strong>         Saves the argument values into the instance variables. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      An object is created and set to the values of the parameters.</li>
     * 
     * @param   <strong>ssn</strong>     An int that stores a Social Security number.
     * @param   <strong>name</strong>    A string that stores a name.
     * 
     */
    public Faculty(int ssn, String name)
    {
        this.ssn = ssn;     //Assign a ssn to the ssn instance variable
        this.name = name;   //Assign a name to the name instance variable
    }
    
    /**
     * <strong>Accessor Method</strong>
     * <ul><li><strong>Action:</strong>         Returns the ssn of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       Ssn has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns a Social Security Number.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>ssn</strong>
     * 
     */
    public int getSSN ()
    {
        return ssn;     //Return the ssn of the current object to the calling method 
    }
    
    /**
     * <strong>Mutator Method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's ssn to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's ssn is assigned a new value.</li>
     * 
     * @param   <strong>ssn</strong>            An int that stores a Social Security number.
     * @return  <strong>none</strong>
     * 
     */
    public void setSSN(int ssn)
    {
        this.ssn = ssn;     //Assign a new ssn to the ssn instance variable
    }
    
    /**
     * <strong>Accessor Method</strong>
     * <ul><li><strong>Action:</strong>         Returns the name of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       Name has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns a name.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>name</strong>
     * 
     */
    public String getName ()
    {
        return name;     //Return the name of the current object to the calling method 
    }
    
    /**
     * <strong>Mutator Method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's name to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's name is assigned a new value.</li>
     * 
     * @param   <strong>name</strong>           A string that stores a name.
     * 
     */
    public void setName(String name)
    {
        this.name = name;     //Assign a new name to the name instance variable
    }
    
    /**
     * <strong>Display Method</strong>
     * <ul><li><strong>Action:</strong>         Prints the value of the name and SSN with a meaningful message </li>
     * <li><strong>Precondition:</strong>       Name and ssn have been initialized. </li>
     * <li><strong>Postcondition:</strong>      Prints the current object's name and ssn when called</li>
     * 
     * @param   <strong>none</strong>
     * @return  <strong>none</strong>
     * 
     */
    public void print()
    {
        System.out.println("Name: " + name
                            + "\nSocial Security Number: " + ssn);
    }
    
    /**
     * <strong>Overrided Equals Method</strong>
     * <ul><li><strong>Action:</strong>         Returns a boolean value if obj1 is equal to obj2 </li>
     * <li><strong>Precondition:</strong>       Obj1 and obj2 have been created </li>
     * <li><strong>Postcondition:</strong>      Returns a boolean.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>name</strong>
     * 
     */
    public boolean equals (Faculty Obj2)
    {
        return this.name.equalsIgnoreCase(Obj2.name) && this.ssn == Obj2.ssn;     //Returns true or false depending on the condition 
    }
}
