
/**
 * Coordinate.java  
 *
 * @author: Anand Vadlamani 
 * 
 * Brief Program Description:
 * This creates the coordinate object. This coordinate is one of many of the ship objects. 
 * Coordinates are what make up the ship (and the number of coordinates is 
 * based on the length of the ship that is created). It has a getX and getY method, 
 * as well as a simple toString. The true complexity of this clas is seen 
 * in its implementation in the other classes and its imperative role in the game overall. 
 */
public class Coordinate
{
    private int xPos,yPos;
    
    public Coordinate(int xPos, int yPos)
    /**
     * makes a coordinate object
     * @param: int xPos, yPos
     * @return: none
     * Autor: Anand Vadlamani
     */
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    /**
     * this method returns the x coordinate of the coordinate object
     * @param: none
     * @return: integer which is xPos
     * Author: Anand Vadlamani 
     */
    public int getX()
    {
        return xPos;
    }
    
    /**
     * this method returns the y coordinate of the coordinate object
     * @param: none
     * @return: integer which is yPos
     * Author: Anand Vadlamani 
     */
    public int getY()
    {
        return yPos; 
    }
    
    /**
     * this prints out the coordinate with the x and y position seperately
     * @param: none
     * @return: string which is the coordinate
     * Author: Anand Vadlamani 
     */
    public String toString()
    {
        return "X: " + xPos + " Y: " + yPos;
    }
}
