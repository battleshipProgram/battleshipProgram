
/**
 * CarrierTester.java  
 *
 * @author: Anand Vadlamani

 * Brief Program Description:
 * This class is a tester for all the methods inside the class. 
 * It tests the getLength() method, as well as the setX() 
 * and the setY() methods. 
 *
 */
public class CarrierTester
{
    public static void main(String [] args)
    {
        Ship s = new Carrier(5,5,true);
        System.out.println(s.getLength());
        System.out.println(s.getCoordinates());
        
        s.setX(6);
        s.setY(6);
        
        System.out.println(s.getCoordinates());
    }
}
