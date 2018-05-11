
/**
 * BattleshipTester.java  
 *
 * @author: Anand Vadlamani

 * Brief Program Description:
 * This class is a tester for all the methods inside the class. 
 * It tests the getLength() method, as well as the setX() 
 * and the setY() methods. 
 *
 */
public class BattleshipTester
{
    public static void main(String [] args)
    {
        Ship s = new Battleship(6,6,true);
        System.out.println(s.getLength());
        System.out.println(s.getCoordinates());
        
        s.setX(7);
        s.setY(7);
        
        System.out.println(s.getCoordinates());
    }
}
