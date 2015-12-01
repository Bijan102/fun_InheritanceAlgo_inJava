
/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doctor extends Person
{
    // Create a constant 'OFFICE_FEE' of type double and initialize it to 150.00
    private static final double OFFICE_FEE = 150.00;
    
    // instance variables - replace the example below with your own
    private double officeFee;
    private String specialty;
    
    
    /**
     * Defualt Constructor using this() to call the 3-argument constructor
     */
    public Doctor()
    {
        // initialise instance variables
        this("N/A", OFFICE_FEE, "None given");
    }

    /**
     * <strong>Overloaded Constructor1</strong>
     * <ul><li><strong>Action:</strong>         Saves the argument values into the instance variables. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      An object is created and set to the values of the parameters.</li>
     * 
     * @param   <strong>name</strong>           A string that stores a name.
     * @param   <strong>specialty</strong>      A string that stores a specialty. 
     * 
     */
    public Doctor(String name, String specialty)
    {
        this(name, OFFICE_FEE, specialty);
    }
    
    
    /**
     * <strong>Overloaded Constructor2</strong>
     * <ul><li><strong>Action:</strong>         Saves the argument values into the instance variables. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      An object is created and set to the values of the parameters.</li>
     * 
     * @param   <strong>name</strong>           A string that stores a name.
     * @param   <strong>officeFee</strong>      A double that stores an officeFee.
     * @param   <strong>specialty</strong>      A string that stores a specialty. 
     * 
     */
    public Doctor(String name, double officeFee, String specialty)
    {
        super(name);
        this.officeFee = officeFee;
        this.specialty = specialty; 
    }
    
    
    /**
     * <strong>Mutator Method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's officeFee to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's officeFee is assigned a new value.</li>
     * 
     * @param   <strong>officeFee</strong>      A double that stores an officeFee.
     * 
     */
    public void setOfficeFee(double officeFee)
    {
        this.officeFee = officeFee;             //Assign officeFee a value.
    }
    
    
    /**
     * <strong>Accessor Method</strong>
     * <ul><li><strong>Action:</strong>         Returns the officeFee of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       OfficeFee has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns a officeFee.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>officeFee</strong>
     * 
     */
    public double getOfficeFee ()
    {
        return officeFee;     //Return the officeFee of the current object to the calling method 
    }
    
    
    /**
     * <strong>Mutator Method</strong>
     * <ul><li><strong>Action:</strong>         Sets the current object's specialty to the value that is passed through the method. </li>
     * <li><strong>Precondition:</strong>       N/A. </li>
     * <li><strong>Postcondition:</strong>      The current object's specialty is assigned a new value.</li>
     * 
     * @param   <strong>specialty</strong>      A string that stores a specialty.
     * 
     */
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;             //Assign specialty a value.
    }
    
    
    /**
     * <strong>Accessor Method</strong>
     * <ul><li><strong>Action:</strong>         Returns the specialty of the current object to the calling method. </li>
     * <li><strong>Precondition:</strong>       Specialty has been initialized. </li>
     * <li><strong>Postcondition:</strong>      Returns a specialty.</li>
     * 
     * @param    <strong>none</strong>
     * @return   <strong>specialty</strong>
     * 
     */
    public String getSpecialty ()
    {
        return specialty;     //Return the officeFee of the current object to the calling method 
    }
    
    
    /**
     * <strong>Print info Method</strong>
     * <ul><li><strong>Action:</strong>         Prints the value of the name, officeFee, and specialty with a meaningful message </li>
     * <li><strong>Precondition:</strong>       Name, officeFee, and specialty have been initialized. </li>
     * <li><strong>Postcondition:</strong>      Prints the current object's name, officeFee and specialty when called</li>
     * 
     * @param   <strong>none</strong>
     * @return  <strong>none</strong>
     * 
     */
    public void printInfo()
    {
        super.printInfo();                                      //Displays the object's name
        System.out.printf("Office fee: $%.2f\n", officeFee);    //Displays the object's officeFee
        System.out.println("Specialty: " + specialty);          //Displays the object's specialty 
    }
    
    
    /**
     * <strong>Equals Method</strong>
     * <ul><li><strong>Action:</strong>         Returns a boolean value if obj1 is equal to obj2 </li>
     * <li><strong>Precondition:</strong>       Obj1 and obj2 have been created </li>
     * <li><strong>Postcondition:</strong>      Returns a boolean value.</li>
     * 
     * @param    <strong>Obj2</strong>
     * @return   <strong>boolean value</strong>
     * 
     */
    public boolean equals (Doctor Obj2)
    {
        //Returns true or false depending on the condition
        return (hasSameName((Person) Obj2)) && ((int)this.officeFee == ((int)Obj2.officeFee)) && (this.specialty.equals(Obj2.specialty)); 
    }
}
