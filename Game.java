import java.util.Scanner;
/**
 * Game.java  
 *
 * @author:
 * Assignment #:
 * 
 * Brief Program Description:
 * runs all the steps necessary to play the game
 *
 */
public class Game
{
    public Game()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Location of Submarine: \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();
        System.out.println("Orientation (right/up): ");
        String orient=scan.nextLine();
        boolean vert;
        if(orient.equals("right")){
            vert=false;
        }
        else{
            vert=true;
        }
        Submarine sub=new Submarine(xPos,yPos,vert);
    }

}
