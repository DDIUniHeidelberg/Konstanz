
/**
 * Write a description of class WUERFEL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
     * EIn etwas seltsames Wuerfeln
     * 
     * @return     Wuerfelergebnis zwischen 1 und 6
     */
    public int wuerfeln()
    {
        x = x+1;
        if ((x % 6)==0) return 6;
        else return x % 6;
    }
}
