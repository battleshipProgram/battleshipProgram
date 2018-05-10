
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
        XD.playerHit(5, 6);
        XD.playerHit(5, 7);
        XD.playerMiss(4, 3);
        XD.playerMiss(5, 3);
        XD.playerMiss(6, 3);
        XD.printBoard();
    }
}
