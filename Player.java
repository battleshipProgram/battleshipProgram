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
    public Player(Submarine s, Gunboat g, Carrier c, Battleship b)
    {
        list.add(s);
        list.add(g);
        list.add(c);
        list.add(b);
    }
    public boolean guess(int xPos,int yPos, ArrayList<Ship> l)
    {
        for(Ship s: l)
        {
            for(Coordinate c: s.getCoordinates())
            {
                
            }
        }
    }
}
