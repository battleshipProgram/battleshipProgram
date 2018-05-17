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
        boolean factor;
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
                        while(yPos + i > 10 || (yPos==co.getY()&&xPos ==co.getX()))
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
                        while(xPos + i > 10 || (xPos == co.getX()&&yPos==co.getY()))
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
                p.getPlayerBoard().setShip(co.getX(), co.getY());

            }
        }
        p.getPlayerBoard().printBoard();
        factor = true;
        
        while(o.getOpponentShips().size() > 0 && p.getShips().size() > 0)
        {   
                factor = false;
                System.out.println("What row would you like to hit?");
                yPos = scan.nextInt();
                System.out.println("What column would you like to hit?");
                xPos = scan.nextInt();
                
                while(yPos < 1 || yPos > 10 || xPos < 1 || xPos > 10)
                {
                    System.out.println("Invalid coordinates, please reenter:");
                    System.out.println("What row would you like to hit?");
                    yPos = scan.nextInt();
                    System.out.println("What column would you like to hit?");
                    xPos = scan.nextInt();
                }
                for(Ship ships: o.getOpponentShips())
                {
                    for(Coordinate co: ships.getCoordinates())
                    {
                        if(co.getX() == xPos && co.getY() == yPos)
                        {
                            targets.playerHit(xPos, yPos);
                            factor = true;
                            ships.getCoordinates().remove(co);
                            
                        }

                    }
                }
                if(factor)
                {
                    System.out.println("You hit!");
                    
                }
                else
                {
                    System.out.println("you missed...");
                    targets.playerMiss(xPos, yPos);
                   
                }
                targets.printBoard();
                
            

            
        }
    }
}
