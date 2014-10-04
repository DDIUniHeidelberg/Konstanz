
/**
 * Implementation of 3 rounds of throw five  dices
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RUNDE
{
    // instance variables - replace the example below with your own
    private WUERFEL erster;
    private WUERFEL zweiter;
    private WUERFEL dritter;
    private WUERFEL vierter;
    private WUERFEL fuenfter;

    /**
     * Constructor for objects of class RUNDE
     */
    public RUNDE()
    {
        // initialise instance variables
        erster = new WUERFEL();
        zweiter = new WUERFEL();
        dritter = new WUERFEL();
        vierter = new WUERFEL();
        fuenfter = new WUERFEL();
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
