
/**
 * Submarine.java  
 *
 * @author: Anand Vadlamani 
 * 
 * Brief Program Description:
 * 
 * Creates the submarine as a subclass of the ship class. This class
 * contains the getLength() method and is able to set the x and y 
 * position of the ship. Note that the x and y position is the top 
 * most or the right most coordinate - based on the orientation 
 * boolean. You can create this object as a ship using
 * polymorphism. 
 *
 */
public class Submarine extends Ship
{
    private int xPos;
    private int yPos;
    private int length; 
    private boolean vert;
    
    /**
     * creates a submarine object
     * @param: int xPos,int yPos,int length,boolean vert
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Submarine(int xPos, int yPos,boolean vert)
    {
        super(xPos,yPos,vert);
        length = 2;
    }
    
    /**
     * getLength() - this method returns the length of the ship 
     * @param: none 
     * @return: int length - the length of the ship 
     * Author: Anand Vadlamani 
     */
    public int getLength()
    {
        return length; 
    }
    
    /**
     * setXPos() - this method sets the x position to a new value
     * @param: int x, which becomes xPos
     * @return: none, void return type
     * Author: Anand Vadlamani 
     */
    public void setX(int x)
    {
        xPos = x;
    }
    
    /**
     * *setYPos() - this method sets the y position to a new value
     * @param: int x, which becomes yPos
     * @return: none, void return type
     * Author: Anand Vadlamani 
     */
    public void setY(int x)
    {
        yPos = x;
    }
}
