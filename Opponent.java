import java.util.ArrayList;
/**
 * Opponent.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Opponent
{
    public ArrayList<Ship> list = new ArrayList<Ship>();
    /**
     * creates a Opponent object to play against the player
     * (this would be an automated system so a lot 
     * of use of math.random and making sure it guesses and 
     * places the ships fairly)
     * @param: Submarine s, Gunboat g, Carrier c, Battleship b
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Opponent(Submarine s, Gunboat g, Carrier c, Battleship b)
    {
        list.add(s);
        list.add(g);
        list.add(c);
        list.add(b);
    }

    /**
     * this method checks to guess 
     */
    public boolean guess(int xPos,int yPos, ArrayList<Ship> ships)
    {
        for(Ship s: ships)
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

    public void setShips()
    {
        
    }
    
    
}
