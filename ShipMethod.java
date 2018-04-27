
/**
 * ShipMethod.java 
 *
 * @author: Anand Vadlamani 
 * 
 * Brief Program Description:
 * This interface is meant to contain the getlength method which will 
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
}
