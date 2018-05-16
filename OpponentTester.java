
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
        
        //creates the Opponent and Board objects
        Board xd = new Board();
        Opponent opponent = new Opponent();
        
        //tests the setShips() method, should put the opponent's ships in random locations, making sure
        //to keep the ships within the boundaries of the board and not overlapping each other
        opponent.setShips();
        
        //lets the player hit the opponent's ships, making each spot on the board be marked with an X
        for(Ship s: opponent.getOpponentShips())
        {
            for(Coordinate c: s.getCoordinates())
            {
                xd.playerHit(c.getX(), c.getY());
            }
        }
        
        //prints the opponent's board with ships on it, should all be X because of the nested for loops
        //above
        xd.printBoard();
        
    }
}
