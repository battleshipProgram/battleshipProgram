import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class ActualGame here.
 * It's the game
 * @author Allen Ding
 * @version (a version number or a date)
 */
public class ActualGame
{
    private Player p;
    private Board playerBoard;
    private Opponent o; 
    private Board targets;
    private Board opponentBoard;
    /**
     * 
     */public ActualGame()
    {
        playerBoard = new Board();
        targets = new Board();
        opponentBoard = new Board();
        o = new Opponent();
        o.setShips();
        for(Ship ships: o.getOpponentShips())
        {
            for(Coordinate co: ships.getCoordinates())
            {
                opponentBoard.setShip(co.getX(), co.getY());
            }
        }
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
            while((xPos > 10)||(yPos > 10)||(xPos <= 0)||(yPos<=0))
            {
                System.out.println("Invalid input, x and y position must be between 1 and 10.");
                if(xPos > 10 || xPos <= 0)
                {
                    System.out.println("Enter the column of the ship: ");
                    xPos = scan.nextInt();
                }
                else if(yPos > 10 || yPos <= 0)
                {
                    System.out.println("Enter the row of the ship: ");
                    yPos = scan.nextInt();
                }
            }
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

        // while(o.getOpponentShips().size() > 0 && p.getShips().size() > 0)
        // {   
        // factor = false;
        // System.out.println("What row would you like to hit?");
        // yPos = scan.nextInt();
        // System.out.println("What column would you like to hit?");
        // xPos = scan.nextInt();

        // while(yPos < 1 || yPos > 10 || xPos < 1 || xPos > 10)
        // {
        // System.out.println("Invalid coordinates, please reenter:");
        // System.out.println("What row would you like to hit?");
        // yPos = scan.nextInt();
        // System.out.println("What column would you like to hit?");
        // xPos = scan.nextInt();
        // }
        // for(Ship ships: o.getOpponentShips())
        // {
        // for(Coordinate co: ships.getCoordinates())
        // {
        // if(co.getX() == xPos && co.getY() == yPos)
        // {
        // targets.playerHit(xPos, yPos);
        // factor = true;

        // }
        // }
        // }
        // if(factor)
        // {
        // System.out.println("You hit!");
        // }
        // else
        // {
        // System.out.println("you missed...");
        // targets.playerMiss(xPos, yPos);
        // }
        // targets.printBoard();


        // }
        Coordinate shot=new Coordinate(0,0);
        System.out.println("Your Turn");
        boolean hit=true;
        int xShot=0,yShot=0;
        ArrayList<Coordinate> listOfShots=new ArrayList<Coordinate>();
        boolean conditionOne=true;
        boolean conditionTwo=true;
        //opponentBoard.printBoard();
        while(opponentBoard.findHashtags() && p.getPlayerBoard().findHashtags())
        {
            hit=true;
            conditionOne=true;
            conditionTwo=true;
        while(hit){
            while(conditionOne||conditionTwo){
                System.out.println("\nLocation to shoot:\nRow: ");

                yShot=scan.nextInt();
                System.out.println("\nColumn: ");
                xShot=scan.nextInt();
                conditionOne=((Math.abs(xShot-5)>5)||(Math.abs(yShot-5)>5));
                shot=new Coordinate(xShot,yShot);
                listOfShots.add(shot);
                int count=0;
                for(int i=0;i<listOfShots.size()-1;i++){
                    if(listOfShots.get(i).equals(shot)){
                        count++;
                    }
                }

                conditionTwo=count>0;
                // while(Math.abs(xShot-5)>5||Math.abs(yShot-5)>5){
                // System.out.println("Invalid location, reenter coordinates");
                // System.out.println("\nLocation to shoot:\nRow: ");
                // scan=new Scanner(System.in);
                // yShot=scan.nextInt();
                // System.out.println("\nColumn: ");
                // xShot=scan.nextInt();
                // }
                // //check for shooting in the same spot
            }

            // if(factor)
            // {
            // System.out.println("You hit!");

            // }
            // else
            // {
            // System.out.println("you missed...");
            // targets.playerMiss(xPos, yPos);

            // }
            // targets.printBoard();


            if(opponentBoard.getGrid()[yShot-1][xShot-1].equals("#")){
                System.out.println("Nice shot!");
                targets.playerHit(shot.getX(),shot.getY());
                opponentBoard.playerHit(shot.getX(), shot.getY());
                hit=true;
                conditionOne=true;
                conditionTwo=true;
            }
            else{
                System.out.println("Miss!");
                targets.playerMiss(shot.getX(),shot.getY());
                hit=false;
                conditionOne=false;
                conditionTwo=false;
            }
            System.out.println("\nYour Shots: \n");
            targets.printBoard();
            
        }
        int xPosO = 0;
        int yPosO = 0;
        boolean opponentHit = true;
        boolean conditionThree = true;
        boolean conditionFour = true;
        ArrayList<Coordinate> listOfShotsO = new ArrayList<Coordinate>();
        while(opponentHit){
            while(conditionThree||conditionFour){
                yPosO = (int)(Math.random() * 10 + 1);
                xPosO = (int)(Math.random() * 10 + 1);
                conditionThree=((Math.abs(xPosO-5)>5)||(Math.abs(yPosO-5)>5));
                shot=new Coordinate(xPosO,yPosO);
                listOfShotsO.add(shot);
                int count=0;
                for(int i=0;i<listOfShotsO.size()-1;i++){
                    if(listOfShotsO.get(i).equals(shot)){
                        count++;
                    }
                }

                conditionFour=count>0;
                // while(Math.abs(xShot-5)>5||Math.abs(yShot-5)>5){
                // System.out.println("Invalid location, reenter coordinates");
                // System.out.println("\nLocation to shoot:\nRow: ");
                // scan=new Scanner(System.in);
                // yShot=scan.nextInt();
                // System.out.println("\nColumn: ");
                // xShot=scan.nextInt();
                // }
                // //check for shooting in the same spot
            }

            // if(factor)
            // {
            // System.out.println("You hit!");

            // }
            // else
            // {
            // System.out.println("you missed...");
            // targets.playerMiss(xPos, yPos);

            // }
            // targets.printBoard();


            if(p.getPlayerBoard().getGrid()[yPosO-1][xPosO-1].equals("#")){
                System.out.println("Opponent hit your ship at row " + yPosO + " and column " + xPosO);
                p.getPlayerBoard().playerHit(shot.getX(),shot.getY());
                opponentHit=true;
                conditionThree=true;
                conditionFour=true;
            }
            else{
                System.out.println("Opponent guessed your ship at row " + yPosO + " and column " + xPosO +", but missed");
                p.getPlayerBoard().playerMiss(shot.getX(),shot.getY());
                opponentHit=false;
                conditionThree=false;
                conditionFour=false;
            }
            System.out.println("\nYour Board with Opponent Guesses/Hits: \n");
            p.getPlayerBoard().printBoard();
            
        }
    }
        System.out.println("Game over");
        
    }
}
