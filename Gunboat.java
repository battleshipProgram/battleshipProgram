
/**
 * Gunboat.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Gunboat extends Ship
{
    private int xPos;
    private int yPos;
    private int length; 
    private boolean vert;
    /**
     * creates a gunboat object
     * @param: int xPos,int yPos,int length,boolean vert
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Gunboat(int xPos, int yPos,boolean vert)
    {
        super(xPos,yPos,vert);
        length = 3;
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
    public void setXPos(int x)
    {
        xPos = x;
    }
    
    /**
     * *setYPos() - this method sets the y position to a new value
     * @param: int x, which becomes yPos
     * @return: none, void return type
     * Author: Anand Vadlamani 
     */
    public void setYPos(int x)
    {
        yPos = x;
    }
}
