import java.util.ArrayList;
/**
 * Ship.java  
 *
 * @author: Anand Vadlamani 
 * 
 * Brief Program Description:
 * This class is the parent abstract ship class. It will be the 
 * parent of the four sub-classes we have which are the four ships. 
 * Further, it will have the abstract method getLength() which 
 * is to be implemented in the four child classes. It creates a ship object,
 * but you can also create the sub classes throughpolymorphism. It
 * instantiates the ship based on length and orientation and coordinates.
 */
public abstract class Ship implements ShipMethod
{
    private int length; 
    private Coordinate c; 
    private ArrayList<Coordinate> coordinates;
    private boolean orient;
    private int x,y;
    /**
     * creates a ship object(note that the ship is an abstract object
     * and thus it could only be instantiated through polymorphism)
     * @param: int xPos,int yPos,int length,boolean vert
     * @return: none. this is a constructor
     * Author: Anand Vadlamani 
     */
    public Ship(int xPos,int yPos,boolean vert, int l)
    {
        x = xPos;
        y = yPos; 
        c = new Coordinate(x,y);
        coordinates=new ArrayList<Coordinate>();
        coordinates.add(c);
        length=l;
        if(vert)
        {
          orient = true;
        }
        else
        {
            orient = false;
        }
        if(orient)
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
     * setX() - this method would prompt no return, but would change the x position of the ship
     * @param: int value that becomes the x position 
     * @return: none
     * Author: Anand Vadlamani 
     */
    public void setX(int value)
    {
        x = value;
        c = new Coordinate(x,y);
        coordinates=new ArrayList<Coordinate>();
        coordinates.add(c);
        if(orient)
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(x, y - i)); 
            }
        }
        else
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(x + i, y)); 
            }
        }
    }
    
    /**
     * this method would prompt no return, but would change the y position of the ship
     * @param: int value that becomes the y position 
     * @return: none
     * Author: Anand Vadlamani 
     */
    public void setY(int value)
    {
        y = value; 
        c = new Coordinate(x,y);
        coordinates=new ArrayList<Coordinate>();
        coordinates.add(c);
        if(orient)
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(x, y - i)); 
            }
        }
        else
        {
            for(int i = 1; i < length; i++)
            {
                coordinates.add(new Coordinate(x + i, y)); 
            }
        }
    }
    
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
    /**
     * getCoordinate() - returns the principle coordinate of the ship
     * @param: none 
     * @return: Coordinate c, which is the principle coordinate 
     * Author: Anand Vadlamani 
     */
    public Coordinate getCoordinate()
    {
        return c; 
    }
    
    /**
     * getOrientation() - this method returns the boolean of the orientation
     * if the returned boolean is true, it is vertical. if it is false, it 
     * is horizontal;
     * @param: none
     * @return: boolean orient
     * Author: Anand Vadlamani 
     */
    public boolean getOrientation()
    {
        return orient; 
    }
}
