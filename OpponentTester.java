
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
        
        
        //creates the Opponent object and Player object
        Board xd = new Board();
        Opponent opponent = new Opponent();
        opponent.setShips();
        for(Ship s: opponent.getOpponentShips())
        {
            for(Coordinate c: s.getCoordinates())
            {
                xd.playerHit(c.getX(), c.getY());
            }
        }
        xd.printBoard();
        
    }
}
