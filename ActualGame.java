import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class ActualGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActualGame
{
    private Player p;
    private Board playerBoard;
    private Opponent o; 
    private Board targets;
    private Board opponentBoard;
    public ActualGame()
    {
        playerBoard = new Board();
        targets = new Board();
        opponentBoard = new Board();
        o = new Opponent();
        o.setShips();
        boolean thing = false;
        Scanner scan = new Scanner(System.in);
        //Getting the coordinates and orientation
        int xPos;
        int yPos;
        String shipName = "";
        Submarine s = new Submarine(-10, -10, false);
        Gunboat g = new Gunboat(-20, -20, false);
        Carrier c = new Carrier(-30, -30, false);
        Battleship b = new Battleship(-40, -40, false);
        ArrayList<Ship> list = new ArrayList<Ship>();
        for(int i = 2; i <= 5; i++)
        {
            if(i == 2)
            {
               shipName = "Submarine";
            }
            else if(i == 3)
            {
                shipName = "Gunboat";
            }
            else if(i == 4)
            {
                shipName = "Carrier";
            }
            else
            {
                shipName = "Battleship";
            }
            System.out.println("Enter the orientation of your " + shipName + ": (up/right)");
            String orient = scan.next();
            if(orient.equals("up"))
            {
                System.out.println("Ship is oriented vertically");
                thing = true;
            }
            else if(orient.equals("right"))
            {
                System.out.println("Ship is oriented horizontally");
                thing = false;
            }
            else
            {
                System.out.println("Invalid input, ship is defaulted to right");
                thing = false;
            }

            System.out.println("Enter the row of the ship: ");
            yPos = scan.nextInt();
            System.out.println("Enter the column of the ship: ");
            xPos = scan.nextInt();
            if(thing)
            {
                for(Ship ships: list)
                {
                    for(Coordinate co: ships.getCoordinates())
                    {
                while(yPos + i > 10 || yPos==co.getY())
                {
                    System.out.println("Invalid coordinates, please reenter: ");
                    System.out.println("Enter the row of the ship: ");
                    yPos = scan.nextInt();
                    System.out.println("Enter the column of the ship: ");
                    xPos = scan.nextInt();
                }
                }
            }
            }
            else
            {
                for(Ship ships: list)
                {
                    for(Coordinate co: ships.getCoordinates())
                    {
                while(xPos + i > 10 || xPos == co.getX())
                {
                    System.out.println("Invalid coordinates, please reenter: ");
                    System.out.println("Enter the row of the ship: ");
                    yPos = scan.nextInt();
                    System.out.println("Enter the column of the ship: ");
                    xPos = scan.nextInt();
                }
                }
                }
            }
            if(i == 2)
            {
                s = new Submarine(xPos, yPos, thing);
                list.add(s);
            }
            else if(i == 3)
            {
                g = new Gunboat(xPos, yPos, thing);
                list.add(g);
            }
            else if(i == 4)
            {
                c = new Carrier(xPos, yPos, thing);
                list.add(c);
            }
            else
            {
                b = new Battleship(xPos, yPos, thing);
                list.add(b);
            }
            
        }
        p = new Player(s, g, c, b, playerBoard);
        for(Ship ships: list)
        {
            for(Coordinate co: ships.getCoordinates())
            {
                p.getPlayerBoard().playerHit(co.getX(), co.getY());
            }
        }
        p.getPlayerBoard().printBoard();
    }
}
