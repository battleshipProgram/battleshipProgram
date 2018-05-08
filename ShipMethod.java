
/**
 * ShipMethod.java 
 *
 * @author: Anand Vadlamani 
 * 
 * Brief Program Description:
 * This interface is meant to contain the getlength, setX, and setY method which will 
 * be implemented in the abstract ship class, and thus be forced to 
 * implement in the rest of the ship subclasses.
 */
public interface ShipMethod
{
    /**
     * this method would prompt the class to return an integer, presumably the length of the ship.
     * @param: none
     * @return: int, which would be the length 
     * Author: Anand Vadlamani 
     */
    public abstract int getLength();
    
    /**
     * this method would prompt no return, but would change the x position of the ship
     * @param: int value that becomes the x position 
     * @return: none
     * Author: Anand Vadlamani 
     */
    public abstract void setX(int value);
    
    /**
     * this method would prompt no return, but would change the y position of the ship
     * @param: int value that becomes the y position 
     * @return: none
     * Author: Anand Vadlamani 
     */
    public abstract void setY(int value);
}
