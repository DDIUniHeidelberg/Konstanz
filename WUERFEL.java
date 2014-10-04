
/**
 * Write a description of class WUERFEL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.lang.Math.*;

public class WUERFEL
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WUERFEL
     */
    public WUERFEL()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int wuerfeln()
    {
        // put your code here
        int value = (int)Math.round(10*Math.random());
        return value;
    }
}
