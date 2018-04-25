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
    public Opponent(Submarine s, Gunboat g, Carrier c, Battleship b)
    {
        list.add(s);
        list.add(g);
        list.add(c);
        list.add(b);
    }
    public void guess(int xPos,int yPos)
    {
        
    }
}
