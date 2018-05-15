import java.util.ArrayList;
/**
 * Player.java  
 *
 * @author: Allen Ding
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

    /**
     * allows the player to guess and sees if they hit an enemy ship or not
     * @param: int xPos, int yPos, ArrayList<Ship> l
     * @return: returns a boolean based on whether or not they hit an enemy ship
     * Author: Allen Ding
     */
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

    /**
     * when the player has not hit a ship,(called when player.guess() returns false)
     * it marks where they guessed.
     * @param: int xPos, int yPos 
     * @return: no return since it changes things on the board
     * Author: Allen Ding
     */
    public void markGuess(int xPos, int yPos)
    {
        b.playerMiss(xPos, yPos);
    }

    /**
     * when the player does hit a ship, (called when player.guess() returns true)
     * it marks where it was they had guessed. If the player has "sunk" a ship,
     * removes that ship from the opponent's arrayList.
     * @param: int xPos, int yPos, ArrayList<Coordinate> opponentShips
     * @return: none, since it only changes the ArrayLists
     * Author: Allen Ding
     */
    public void markHit(int xPos, int yPos, ArrayList<Ship> opponentShips)
    {
        b.playerHit(xPos,yPos);
        for(Ship s: opponentShips)
        {
            for(Coordinate c: s.getCoordinates())
            {
                if(c.getX() == xPos && c.getY() == yPos)
                {
                    s.getCoordinates().remove(c);
                }
                if(s.getCoordinates().size() == 0)
                {
                    opponentShips.remove(s);
                }
            }
        }
    }

    /**
     * If the player is hit, it removes the coordinate of the ship that was hit.
     * If the ship has been destroyed, removes that ship from the ArrayList of
     * ships.
     * @param: int xPos, int yPos, ArrayList<Ship> playerShips
     * @return: does not return anything since it is changing the ArrayList
     * Author: Allen Ding
     */
    public void playerHit(int xPos, int yPos, ArrayList<Ship> playerShips)
    {
        for(Ship s: playerShips)
        {
            for(Coordinate c: s.getCoordinates())
            {
                if(c.getX() == xPos && c.getY() == yPos)
                {
                    s.getCoordinates().remove(c);
                }
                if(s.getCoordinates().size() == 0)
                {
                    playerShips.remove(s);
                }
            }
        }
    }
    /**
     * returns the ArrayList of Ships that the player has
     * @param: none
     * @return: ArrayList
     * @author: Matt Li
     */
    public ArrayList getShips()
    {
        return list;
    }
    
    /**
     * Returns the player's board
     * @param: none
     * @return: returns a Board object
     * Author: Allen Ding
     */
    public Board getPlayerBoard()
    {
        return b;
    }
}
