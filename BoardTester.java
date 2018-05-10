
/**
 * BoardTester.java  
 *
 * @author: Allen Ding
 * Assignment #:
 * 
 * Brief Program Description:
 * 
 *
 */
public class BoardTester
{
    public static void main(String [] args)
    {
        //Making board
        Board XD = new Board();
        XD.printBoard();
        //Marking the board with a hit
        XD.playerHit(5, 5);
        XD.printBoard();
    }
}
