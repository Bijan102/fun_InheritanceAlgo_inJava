
/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    
    /**
     * Defualt Constructor using this() to call the 1-argument constructor
     */
    public Person()
    {
        // initialise instance variables
        this("N/A");
    }

    /**
     * <strong>Overloaded Constructor</strong>
     * <ul><li><strong>Action:</strong>         Saves the argument values into the instance variables. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      An object is created and set to the values of the parameters.</li>
     * 
     * @param   <strong>name</strong>    A string that stores a name.
     * 
     */
    public Person(String name)
    {
        this.name = name;   //Assign a name to the name instance variable
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
     * <strong>Display Method</strong>
     * <ul><li><strong>Action:</strong>         Prints the value of the name and SSN with a meaningful message </li>
     * <li><strong>Precondition:</strong>       Name and ssn have been initialized. </li>
     * <li><strong>Postcondition:</strong>      Prints the current object's name and ssn when called</li>
     * 
     * @param   <strong>none</strong>
     * @return  <strong>none</strong>
     * 
     */
    public void printInfo()
    {
        System.out.println("Name: " + name);
    }
    
    /**
     * <strong>Has Same Name Method</strong>
     * <ul><li><strong>Action:</strong>         Returns a boolean value if obj1 is equal to obj2 </li>
     * <li><strong>Precondition:</strong>       Obj1 and obj2 have been created </li>
     * <li><strong>Postcondition:</strong>      Returns a boolean.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>name</strong>
     * 
     */
    public boolean hasSameName (Person Obj2)
    {
        return this.name.equalsIgnoreCase(Obj2.name);     //Returns true or false depending on the condition 
    }
}
