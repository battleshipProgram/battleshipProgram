import java.util.ArrayList;
/**
 * Opponent.java  
 *
 * @author: Matt Li
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Opponent
{
    private static ArrayList<Ship> list = new ArrayList<Ship>();
    private static int xPos;
    private static int yPos;
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
     * The guess(ArrayList<Ship> l) allows the ship to take a shot at a 
     * Player's ship. It hits a random xPos and yPos and if it hits any 
     * coordinate of a ship, it returns true. In the Game class, if the boolean
     * returns true, the ship will be allowed to take another guess that will
     * be around the place that it hit.
     * @param: ArrayList<Ship> l
     * @return: boolean
     * @Author: Matt Li
     */
    public boolean guess(ArrayList<Ship> l)
    {
        ArrayList <Coordinate> coordinates = new ArrayList<Coordinate>();
        xPos = (int)(Math.random()*10 + 1);
        yPos = (int)(Math.random()*10 + 1);
        Coordinate coordinate = new Coordinate (xPos, yPos);
        coordinates.add(coordinate);
        for(Ship s: l)
        {
            for(Coordinate c: s.getCoordinates())
            {
                while (c.getX() == coordinate.getX() && c.getY() == coordinate.getY())
                {
                    xPos = (int)(Math.random()*10 + 1);
                    yPos = (int)(Math.random()*10 + 1);
                }
                return true;
            }
        }
        return false;
    }

    public static void setShips()
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
               while (c.getX() == coordinate.getX() && c.getY() == coordinate.getY())
               {
                   xPos = (int)(Math.random()*10 + 1);
                   yPos = (int)(Math.random()*10 + 1);
               }               
            }
        }
    }
    
    
}
