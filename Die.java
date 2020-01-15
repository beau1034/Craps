
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int result;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        result = roll();
    }

    /**
     * roll method rolls the die and returns the result 
     *
     * 
     * @return    the sum of x and y
     */
    public int roll()
    {
        // put your code here
        result = (int) (Math.random() * 6 + 1);
        return result;
    }
    
    /** 
     * The getResult() method returns the current state of the die 
     */
    public int getResult()
    {
        return result; 
    }
}
