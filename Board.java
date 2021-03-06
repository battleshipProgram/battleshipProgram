
/**
 * board.java  
 *
 * @author: Andrew Zuang and Anand Vadlamani 
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
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                grid[i][j] = "_";
            }

        }
    }

    public void opponentHit(int xPos, int yPos)
    /**
     * marks a hit as an X when the opponent hits the player's ship
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[yPos - 1][xPos - 1]="X";
    }

    public void opponentMiss(int xPos, int yPos)
    /**
     * marks a miss as O when the opponent misses the player's ships
     * @param Coordinate - location to be marked
     * @return none
     * @author Andrew
     */
    {
        grid[yPos - 1][xPos - 1]="O";
    }

    public void playerHit(int xPos, int yPos)
    /**
     * marks a hit when the player hits an opposing ship
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        
            grid[yPos -1][xPos -1]="X";
        
    }

    public void playerMiss(int xPos, int yPos)
    /**
     * marks a miss when the player misses an opposing ship
     * @param Coordinate - location
     * @return none
     * @author Andrew
     */
    {
        grid[yPos - 1][xPos - 1]="O";
    }

    public void setShip(int x, int y)
    /**
     * labels a certain spot with a hashtag to mark a ship
     * @author Andrew
     * @param int x, int y
     * @return none
     */
    {

        grid[y-1][x-1]="#";

        

    }

    public String[][] getGrid()
    /**
     * returns the board
     * @author Andrew
     * @param none
     * @return String[][]
     */
    {
        return grid;
    }

    /**
     * prints the board- Anand
     * added spacing as well as labeling columns and rows for a good layout of the board- Allen
     * @param: none
     * @return none, its a void return type
     * Author: Anand Vadlamani/Allen Ding
     */
    public void printBoard()
    {
        System.out.print(" ");
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("   " + i);
        }
        System.out.println();
        for(int i = 0; i < grid.length; i++)
        {
            if(i < 9)
            {
                System.out.print(i + 1 + "   ");
            }
            else
            {
                System.out.print(i + 1 + "  ");
            }
            for(int j = 0; j < grid[i].length; j++)
            {
                System.out.print(grid[i][j]+ "   " );
            }
            System.out.println(); 
        }
    }
    public boolean findHashtags()
    /**
     * checks if there are still unhit ships on the board
     * @author Allen
     * @param none
     * @return boolean
     */
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j].equals("#"))
                {
                    return true;
                    }
            }

        }
        return false;
    }
}
