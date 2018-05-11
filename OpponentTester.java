
/**
 * OpponentTester.java  
 *
 * @author: Matt Li
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class OpponentTester
{
    public static void main (String [] args)
    {
        //creates the Ship objects necessary to be used in the Opponent object
        Submarine s = new Submarine(3, 7, true);
        Gunboat g = new Gunboat(5, 2, true);
        Carrier c = new Carrier(7, 2, false);
        Battleship b = new Battleship(2, 5, true);
        
        //creates the Opponent object
        Opponent opponent = new Opponent(s, g, c, b);
        
        
        
    }
}
