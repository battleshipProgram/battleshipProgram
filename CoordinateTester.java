
/**
 * CoordinateTester.java  
 *
 * @author:
 * Assignment #: Matt Li
 * 
 * Brief Program Description:
 * 
 *
 */
public class CoordinateTester
{
    public static void main (String [] args)
    {
        //creates a Coordinate object
        Coordinate coordinate = new Coordinate (5, 5);
        
        //the getX() method should return the x-coordinate of the Coordinate object
        System.out.println(coordinate.getX());
        
        //the getX() method should return the x-coordinate of the Coordinate object
        System.out.println(coordinate.getY());
        
        //tests the toString() method
        System.out.println(coordinate);
    }
}
