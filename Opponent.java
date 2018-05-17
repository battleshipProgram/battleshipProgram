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
    public Opponent()
    {

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
     * Method that instantiates a submarine, gunboat, carrier, and battleship
     * while also checking that it stays within the board
     * @param: none
     * @return: none (void)
     * @author: Allen Ding
     */
    public static void setShips()
    {
        // for(int i = 2; i <= 5; i++)
        // {
            // xPos = (int)(Math.random() * (10 - i) + 1);
            // yPos = (int)(Math.random() * (10) + 1);
            // for(Ship s: list)
            // {
                // for(Coordinate c: s.getCoordinates())
                // {
                    // for(int j = 0; j < i; j++)
                    // {
                        // while(xPos + j == c.getX() || yPos + j == c.getY())
                        // {
                            // xPos = (int)(Math.random() * (10 - i) + 1);
                            // yPos = (int)(Math.random() * (10) + 1);
                        // }
                    // }
                // }
            // }

            // if(i == 2)
            // {
                // Submarine s = new Submarine(xPos, yPos, false);
                // list.add(s);
            // }
            // else if(i == 3)
            // {
                // Gunboat g = new Gunboat(xPos, yPos, false);
                // list.add(g);
            // }
            // else if(i == 4)
            // {
                // Carrier c = new Carrier(xPos, yPos, false);
                // list.add(c);
            // }
            // else
            // {
                // Battleship b = new Battleship(xPos, yPos, false);
                // list.add(b);
            // }
        // }
        Submarine s = new Submarine(1, 1, true);
        Gunboat g = new Gunboat(1, 2, true);
        Carrier c = new Carrier(1, 3, true);
        Battleship b = new Battleship(1, 4, true);
        list.add(s);
        list.add(g);
        list.add(c);
        list.add(b);

    }

    /**
     * returns an arrayList of the opponent's ships.
     * @param: none
     * @return: arrayList of Ships
     * @author: Allen Ding
     */
    public ArrayList<Ship> getOpponentShips()
    {
        return list;
    }

}
