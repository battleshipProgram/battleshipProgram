import java.util.ArrayList;
/**
 * Ship.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public abstract class Ship implements ShipMethod
{
    private int length; 
    Coordinate c; 
    private ArrayList<Coordinate> coordinates;
    private boolean orientVert,orientHor;
    /**
     * creates a ship object(note that the ship is an abstract object
     * and thus it could only be instantiated through polymorphism)
     * @param: int xPos,int yPos,int length,boolean vert
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Ship(int xPos, int yPos,boolean vert)
    {
        c = new Coordinate(xPos,yPos);
        coordinates.add(c);
        if(vert)
        {
            orientVert = true;
            orientHor = false;
        }
        else
        {
            orientVert = false;
            orientHor = true;
        }
        if(vert)
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(xPos, yPos + i)); 
            }
        }
        else
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(xPos + i, yPos)); 
            }
        }
    }

    /**
     * getLength() - this method returns the length of the ship 
     * @param: none 
     * @return: int length - the length of the ship (this will be used in all subclasses,
     * not in this class, as it is an abstract method).
     * Author: Anand Vadlamani 
     */
    public abstract int getLength();
    
    /** 
     * getCoordinates() - this method returns the arraylist of coordintaes that make up the ship 
     * @param: none
     * @return: arraylist coordinates - the coordinates of the ship
     * Author: Anand Vadlamani 
     */
    public ArrayList<Coordinate> getCoordinates()
    {
        return coordinates; 
    }
}
