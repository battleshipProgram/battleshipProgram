
/**
 * Submarine.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
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
    public Submarine(int xPos, int yPos, int length, boolean vert)
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
    public void setXPos(int x)
    {
        xPos = x;
    }
    public void setYPos(int x)
    {
        yPos = x;
    }
}
