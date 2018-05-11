
/**
 * BattleshipTester.java  
 *
 * @author: Anand Vadlamani
 * Assignment #:
 * 
 * Brief Program Description:
 * 
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
