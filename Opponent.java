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
    
    /**
     * The setShips() method sets the top left coordinate of each ship of 
     * the Opponent, which is a computer. It does so with a random x and y
     * position, and then creating a new coordinate out of it, which is added
     * to an ArrayList of Coordinates. The method then checks to see if the
     * random positions generated for xPos and yPos are in the ArrayList
     * of coordinates that have already been given for the ships, and 
     * regenerates xPos and yPos if necessary.
     * @param: none
     * @return: none (void)
     * @author: Matt Li
     */
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
    
    /**
     * returns an arrayList of the opponent's ships.
     * @param: none
     * @return: arrayList of Ships
     * @author: Allen Ding
     */
    public ArrayList getOpponentShips()
    {
        return list;
    }
    
    
}
