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
    /**
     * note to self: make all variables xd
     */
    public ArrayList<Ship> list = new ArrayList<Ship>();
    Board b = new Board();
    /**
     * creates a player object
     * @param: Submarine s, Gunboat g, Carrier c, Battleship b, Board xd
     * @return: it's a constructor for gods sake there is no return
     * Author: Allen Ding
     */
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
    public void markHit(int xPos, int yPos, ArrayList<Coordinate> opponentShips)
    {
        b.playerHit(xPos, yPos);
        for(Coordinate c: opponentShips)
        {
            if(c.getX() == xPos && c.getY() == yPos)
            {
                opponentShips.remove(c);
            }
        }
    }
    public void playerHit(int xPos, int yPos, ArrayList<Coordinate> playerShips)
    {
        for(Coordinate c: playerShips)
        {
            if(c.getX() == xPos && c.getY() == yPos)
            {
                playerShips.remove(c);
            }
        }
    }
}
