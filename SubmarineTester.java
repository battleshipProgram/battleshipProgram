
/**
 * SubmarineTester.java  
 *
 * @author: anand vadlamani 
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class SubmarineTester
{
    public static void main(String [] args)
    {
        Ship s = new Submarine(5,5,true); 
        System.out.println(s.getLength()); 
        s.setX(6);
        s.setY(4);
        System.out.println(s.getCoordinate()); 
    }
}
