import java.util.ArrayList;
/**
 * Player.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Player
{
    public ArrayList<Ship> list = new ArrayList<Ship>();
    Board b = new Board();
    public Player(Submarine s, Gunboat g, Carrier c, Battleship b, Board xd)
    {
        list.add(s);
        list.add(g);
        list.add(c);
        list.add(b);
        this.b = xd;
    }
    public boolean guess(int xPos, int yPos, ArrayList<Ship> l)
    {
        for(Ship s: l)
        {
            for(Coordinate c: s.getCoordinates())
            {
                if(c.getX() == xPos && c.getY() == yPos)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public void markGuess(int xPos, int yPos)
    {
        b.playerMiss(xPos, yPos);
    }
    public void markHit(int xPos, int yPos)
    {
        b.playerHit(xPos, yPos);
    }
}
