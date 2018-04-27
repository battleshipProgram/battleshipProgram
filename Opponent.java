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
    private ArrayList<Ship> list = new ArrayList<Ship>();
    private int xPos;
    private int yPos;
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
    
    public boolean guess(ArrayList<Ship> l)
    {
        xPos = (int)(Math.random()*10 + 1);
        yPos = (int)(Math.random()*10 + 1);
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
    
    /**
     * this method checks to guess 
     */
    public void nextToHit()
    {
        xPos = (int)(Math.random()*10 + 1);
        yPos = (int)(Math.random()*10 + 1);
        
    }

    public void setShips()
    {
        for (Ship s: list)
        {
            for (Coordinate c: s.getCoordinates())
            {
                ArrayList <Coordinate> coordinates = new ArrayList<Coordinate>();
               
                
                    
                    xPos = (int)(Math.random()*10 + 1);
                    yPos = (int)(Math.random()*10 + 1);
                    Coordinate coordinate = new Coordinate (xPos, yPos);
                    coordinates.add(coordinate);
                
            }
        }
    }
    
    
}
