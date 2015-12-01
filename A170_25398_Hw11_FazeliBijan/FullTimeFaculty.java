
/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FullTimeFaculty extends Faculty
{
    // instance variable
    private double salary;
    
    /**
     * Defualt Constructor using this() to call the 3-argument constructor
     */
    public FullTimeFaculty()
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
     * @param   <strong>salary</strong>         A double that stores a salary. 
     * 
     */
    public FullTimeFaculty(int ssn, String name, double salary)
    {
        super(ssn, name);       //Call the base constructor and pass in two params, 'ssn, and name'
        this.salary = salary;   //Assign a salary to the salary instance variable
    }
    
    /**
     * <strong>Accessor method</strong>
     * <ul><li><strong>Action:</strong>         Returns the salary of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       Salary has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns the object's current salary.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>salary</strong>
     * 
     */
    public double getSalary ()
    {
        return salary;     //Return the salary of the current object to the calling method 
    }
    
    /**
     * <strong>Mutator method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's ssn to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's salary is assigned a new value.</li>
     * 
     * @param   <strong>salary</strong>         An double that stores a salary.
     * @return  <strong>none</strong>
     * 
     */
    public void setSalary(double salary)
    {
        this.salary = salary;     //Assign a new salary to the ssn instance variable
    }
    
    /**
     * <strong>Display method</strong>
     * <ul><li><strong>Action:</strong>         Prints the value of the name, ssn, and salary with a meaningful message </li>
     * <li><strong>Precondition:</strong>       Name, ssn and salary have been initialized. </li>
     * <li><strong>Postcondition:</strong>      Prints the current object's name, ssn and salary when called</li>
     * 
     * @param   <strong>none</strong>
     * @return  <strong>none</strong>
     * 
     */
    public void print()
    {
        super.print();
        System.out.printf("Salary: $%.2f", salary);
    }
    
    /**
     * <strong>Overrided Equals Method</strong>
     * <ul><li><strong>Action:</strong>         Returns a boolean value if obj1's name, ssn, and salary are equal to obj2's </li>
     * <li><strong>Precondition:</strong>       Obj1 and obj2 have been created </li>
     * <li><strong>Postcondition:</strong>      Returns a boolean.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>name</strong>
     * 
     */
    public boolean equals (FullTimeFaculty Obj2)
    {
        return equals((Faculty)Obj2) && ((int)this.salary == (int)Obj2.salary);     //Returns true or false depending on the condition 
    }
}
