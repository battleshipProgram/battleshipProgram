
/**
 * Carrier.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class Carrier extends Ship
{
    private int xPos;
    private int yPos;
    private int length; 
    private boolean vert;
    /**
     * creates a carrier object
     * @param: int xPos,int yPos,int length,boolean vert
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Carrier(int xPos, int yPos, int length, boolean vert)
    {
        super(xPos,yPos,length,vert);
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
