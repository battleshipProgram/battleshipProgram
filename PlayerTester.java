
/**
 * PlayerTester.java  
 *
 * @author: Matt Li
 * Assignment #:
 * 
 * Brief Program Description: This is the tester for the Player class.
 * 
 *
 */
public class PlayerTester
{
    public static void main (String [] args)
    {
        Submarine s = new Submarine(3, 3, true);
        Gunboat g = new Gunboat(5, 5, false);
        Carrier c = new Carrier(5, 7, true);
        Battleship b = new Battleship(1, 4, true);
        Board xd = new Board();
        Player player = new Player(s, g,  c, b, xd);
        
        // tests the guess method. will return true if the player's guess hits a coordinate
        // in the opponent's array list of ships
        //player.guess(5,5,ArrayList <Ship> l);
        
        // if the player misses, the location is marked so the player knows not to guess there
        // again
        //player.markGuess();
        
        // if the player hits an opponent's ships, the location is marked. if an opponent's ship
        // is sunk, the opponent's ship will be removed from its array list
        //player.markHit();
        
        // if a player's ship is hit, the coordinate of the ship will be removed. If a player's
        // ship is sunk, the ship will be removed from the array list
        //player.playerHit();
    }
}
