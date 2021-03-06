
/**
 * PlayerTester.java  
 *
 * @author: Dinger
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class PlayerTester
{
    public static void main(String [] args)
    {
        Submarine s = new Submarine(3, 7, true);
        Gunboat g = new Gunboat(5, 2, true);
        Carrier c = new Carrier(7, 2, false);
        Battleship b = new Battleship(2, 5, true);
        Board xd = new Board();
        Player p = new Player(s, g, c, b, xd);
        Opponent o = new Opponent();
        p.getPlayerBoard().playerHit(5, 5);
        p.getPlayerBoard().printBoard();
        boolean thing = p.guess(5, 7, o.getOpponentShips());
        if(thing)
        {
            p.markHit(5, 7, o.getOpponentShips());
        }
        else
        {
            p.markGuess(5, 7);
        }
        p.getPlayerBoard().printBoard();
    }
}
