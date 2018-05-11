
/**
 * GunboatTester.java  
 *
 * @author: Anand Vadlamani 
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class GunboatTester
{
    public static void main(String [] args)
    {
        Ship s = new Gunboat(5,5,true);
        System.out.println(s.getLength());
        System.out.println(s.getCoordinates());
        
        s.setX(6);
        s.setY(6);
        
        System.out.println(s.getCoordinates());
    }
}
