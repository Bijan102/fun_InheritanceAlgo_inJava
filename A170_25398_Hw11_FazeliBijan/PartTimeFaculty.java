
/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartTimeFaculty extends Faculty
{
    // instance variable
    private double hourlyWage;
    
    /**
     * Defualt Constructor using this() to call the 3-argument constructor
     */
    public PartTimeFaculty()
    {
        // initialise instance variables
        this(0, "N/A", 0.0);
    }

    /**
     * <strong>Overloaded Constructor</strong>
     * <ul><li><strong>Action:</strong>         Saves the argument values into the instance variables. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      An object is created and set to the values of the parameters.</li>
     * 
     * @param   <strong>ssn</strong>            An int that stores a Social Security number.
     * @param   <strong>name</strong>           A string that stores a name.
     * @param   <strong>hourlyWage</strong>     A double that stores an hourly wage. 
     * 
     */
    public PartTimeFaculty(int ssn, String name, double hourlyWage)
    {
        super(ssn, name);       //Call the base constructor and pass in two params, 'ssn, and name'
        this.hourlyWage = hourlyWage;   //Assign a salary to the salary instance variable
    }
    
    /**
     * <strong>Accessor method</strong>
     * <ul><li><strong>Action:</strong>         Returns the hourly wage of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       Hourly wage has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns the object's current hourly wage.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>salary</strong>
     * 
     */
    public double getHourlyWage ()
    {
        return hourlyWage;     //Return the salary of the current object to the calling method 
    }
    
    /**
     * <strong>Mutator method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's hourly wage to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's ssn is assigned a new value.</li>
     * 
     * @param   <strong>hourlyWage</strong>     A double that stores an employee's hourly wage.
     * @return  <strong>none</strong>
     * 
     */
    public void setHourlyWage(double hourlyWage)
    {
        this.hourlyWage = hourlyWage;     //Assign a new ssn to the ssn instance variable
    }
    
    /**
     * <strong>Display method</strong>
     * <ul><li><strong>Action:</strong>         Prints the value of the name, ssn, and hourly wage with a meaningful message </li>
     * <li><strong>Precondition:</strong>       Name, ssn and hourly wage have been initialized. </li>
     * <li><strong>Postcondition:</strong>      Prints the current object's name, ssn and hourly wage when called</li>
     * 
     * @param   <strong>none</strong>
     * @return  <strong>none</strong>
     * 
     */
    public void print()
    {
        super.print();
        System.out.printf("Hourly wage: $%.2f", hourlyWage);
    }
    
    /**
     * <strong>Overrided Equals Method</strong>
     * <ul><li><strong>Action:</strong>         Returns a boolean value if obj1's name, ssn, and hourly wage are equal to obj2's </li>
     * <li><strong>Precondition:</strong>       Obj1 and obj2 have been created </li>
     * <li><strong>Postcondition:</strong>      Returns a boolean.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>name</strong>
     * 
     */
    public boolean equals (PartTimeFaculty Obj2)
    {
        return equals((Faculty)Obj2) && ((int)this.hourlyWage == (int)Obj2.hourlyWage);     //Returns true or false depending on the condition 
    }
}
