
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
    public void opponentHit(int xPos, int yPos)
    /**
     * marks a hit as an X when the opponent hits the player's ship
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[xPos][yPos]="X";
    }
    public void opponentMiss(int xPos, int yPos)
    /**
     * marks a miss as O when the opponent misses the player's ships
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[xPos][yPos]="O";
    }
    public void playerHit(int xPos, int yPos)
    /**
     * marks a hit when the player hits an opposing ship
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        grid[xPos][yPos]="X";
    }
    public void playerMiss(int xPos, int yPos)
    /**
     * marks a miss when the player misses an opposing ship
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        grid[xPos][yPos]="O";
    }
    /**
     * prints the board 
     * @param: none
     * @return none, its a void return type
     * Author: Anand Vadlamani 
     */
    public void printBoard()
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j]);
            }
            System.out.println(); 
        }
    }
}
