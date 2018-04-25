
/**
 * board.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 10x10 board
 *
 */
public class Board
{
    private String [][]grid;
    public Board()
    /**
     * creates a new 10x10 board
     * @param none
     * @author Andrew
     */
    {
        grid = new String[10][10];
    }
    public void opponentHit(Coordinate c)
    /**
     * marks a hit as an X on the opponent's board
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[c.getX()][c.getY()]="X";
    }
    public void opponentMiss(Coordinate c)
    /**
     * marks a miss as O on the opponent's board
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[c.getX()][c.getY()]="O";
    }
    public void playerHit(Coordinate c)
    /**
     * marks a hit on player's board
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        grid[c.getX()][c.getY()]="X";
    }
    public void playerMiss(Coordinate c)
    /**
     * marks a miss on the player's board
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        grid[c.getX()][c.getY()]="O";
    }
}
