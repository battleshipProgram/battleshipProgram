import java.util.Scanner;
import java.util.ArrayList; 
/**
 * Game.java  
 *
 * @author: Andrew Zhuang
 * Brief Program Description:
 * runs all the steps necessary to play the game
 *
 */
public class Game
{
    private Player p;
    private Board playerBoard;
    private Opponent o; 
    public Game()
    {
        playerBoard=new Board();
        Ship sub=createSub();
        Ship gun=createGun();
        Ship car=createCarrier();
        Ship battle=createBattle();
        boolean overlap=(overlapSubGun(sub,gun)&&overlapSubCarrier(sub,car)&&overlapSubBattle(sub,battle)&&overlapGunCarrier(gun,car)&&overlapGunBattle(gun,battle)&&overlapCarrierBattle(car,battle));
        while(overlap){
            if(overlapSubGun(sub,gun)){
                System.out.println("The Sub and the Gunboat are overlapping, please reenter coordinates");
            }
            if(overlapSubCarrier(sub,car)){
                System.out.println("The Sub and the Carrier are overlapping, please reenter coordinates");
            }
            if(overlapSubBattle(sub,battle)){
                System.out.println("The Sub and the Battleship are overlapping, please reenter coordinates");
            }
            if(overlapGunCarrier(gun,car)){
                System.out.println("The Gunboat and the Carrier are overlapping, please reenter coordinates");
            }
            if(overlapGunBattle(gun,battle)){
                System.out.println("The Gunboat and the Battleship are overlapping, please reenter coordinates");
            }
            if(overlapCarrierBattle(car,battle)){
                System.out.println("The Carrier and the Battleship are overlapping, please reenter coordinates");
            }
            sub=createSub();
            gun=createGun();
            car=createCarrier();
            battle=createBattle();
            overlap=(overlapSubGun(sub,gun)||overlapSubCarrier(sub,car)||overlapSubBattle(sub,battle)||overlapGunCarrier(gun,car)||overlapGunBattle(gun,battle)||overlapCarrierBattle(car,battle));
        }


    }

    public boolean overlapSubGun(Ship s,Ship g)
    {
        int count=0;
        for(Coordinate i:s.getCoordinates()){
            for(Coordinate j:g.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlapSubCarrier(Ship s, Ship c)
    {
        int count=0;
        for(Coordinate i:s.getCoordinates()){
            for(Coordinate j:c.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlapSubBattle(Ship s,Ship b)
    {
        int count=0;
        for(Coordinate i:s.getCoordinates()){
            for(Coordinate j:b.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlapGunCarrier(Ship g,Ship c)
    {
        int count=0;
        for(Coordinate i:g.getCoordinates()){
            for(Coordinate j:c.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlapGunBattle(Ship g,Ship b)
    {
        int count=0;
        for(Coordinate i:g.getCoordinates()){
            for(Coordinate j:b.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean overlapCarrierBattle(Ship c,Ship b)
    {
        int count=0;
        for(Coordinate i:c.getCoordinates()){
            for(Coordinate j:b.getCoordinates()){
                if(i.getX()==j.getX()&&i.getY()==j.getY()){
                    count++;
                }
            }
        }

        if(count>0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This method creates a submarine ship in the game class.
     * It makes sure the inputs are valid, and checks the orientation
     * entered so that it creates a ship of the appropriate 
     * length and the appropriate orientation.
     * @param: none
     * @return: Ship, which is the ship being created.
     * @Author: Andrew Zhuang
     */
    public Ship createSub()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Location of Submarine: \nRow: ");
        int yPos=scan.nextInt();
        System.out.print("\nCol: ");
        int xPos=scan.nextInt();

        System.out.print("\nOrientation (right/up): ");
        String orient=scan.next();
        boolean vert;
        if(orient.equals("right")){
            vert=false;
        }
        else if(orient.equals("up")){
            vert=true;
        }
        else{
            System.out.println("Invalid input, defaulted to right");
            vert=false;
        }

        Ship sub=new Submarine(xPos-1,yPos-1,vert);
        int count=0;
        for(Coordinate c:sub.getCoordinates()){
            if(c.getX()>9||c.getY()>9||c.getY()<0){
                count++;
            }
        }
        while(count>0){
            System.out.println("Invalid input, Reenter coordinates: ");
            System.out.print("Location of Submarine: \nRow: ");
            yPos=scan.nextInt();
            System.out.print("\nCol: ");
            xPos=scan.nextInt();

            System.out.print("\nOrientation (right/up): ");
            orient=scan.next();

            if(orient.equals("right")){
                vert=false;
            }
            else if(orient.equals("up")){
                vert=true;
            }
            else{
                System.out.println("Invalid input, defaulted to right");
                vert=false;
            }
            count=0;
            sub=new Submarine(xPos-1,yPos-1,vert);
            for(Coordinate c:sub.getCoordinates()){
                if(c.getX()>9||c.getY()>9||c.getY()<0){
                    count++;
                }
            }
        }
        return sub;

    }

    /**
     * This method creates a gunboat ship in the game class.
     * It makes sure the inputs are valid, and checks the orientation
     * entered so that it creates a ship of the appropriate 
     * length and the appropriate orientation.
     * @param: none
     * @return: Ship, which is the ship being created.
     * @Author: Andrew Zhuang
     */
    public Ship createGun()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("\nLocation of Gunboat: \nRow: ");
        int yPos=scan.nextInt();
        System.out.print("\nCol: ");
        int xPos=scan.nextInt();

        System.out.print("\nOrientation (right/up): ");
        String orient=scan.next();
        boolean vert;
        if(orient.equals("right")){
            vert=false;
        }
        else if(orient.equals("up")){
            vert=true;
        }
        else{
            System.out.println("Invalid input, defaulted to right");
            vert=false;
        }

        Ship gun=new Gunboat(xPos-1,yPos-1,vert);
        int count=0;
        for(Coordinate c:gun.getCoordinates()){
            if(c.getX()>9||c.getY()>9||c.getY()<0){
                count++;
            }
        }
        while(count>0){
            System.out.println("Invalid input, Reenter coordinates: ");
            System.out.print("Location of Gunboat: \nRow: ");
            yPos=scan.nextInt();
            System.out.print("\nCol: ");
            xPos=scan.nextInt();

            System.out.print("\nOrientation (right/up): ");
            orient=scan.next();

            if(orient.equals("right")){
                vert=false;
            }
            else if(orient.equals("up")){
                vert=true;
            }
            else{
                System.out.println("Invalid input, defaulted to right");
                vert=false;
            }
            count=0;
            gun=new Gunboat(xPos-1,yPos-1,vert);
            for(Coordinate c:gun.getCoordinates()){
                if(c.getX()>9||c.getY()>9||c.getY()<0){
                    count++;
                }
            }
        }
        return gun;

    }

    /**
     * This method creates a carrier ship in the game class.
     * It makes sure the inputs are valid, and checks the orientation
     * entered so that it creates a ship of the appropriate 
     * length and the appropriate orientation.
     * @param: none
     * @return: Ship, which is the ship being created.
     * @Author: Andrew Zhuang
     */
    public Ship createCarrier()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("\nLocation of Carrier: \nRow: ");
        int yPos=scan.nextInt();
        System.out.print("\nCol: ");
        int xPos=scan.nextInt();

        System.out.print("\nOrientation (right/up): ");
        String orient=scan.next();
        boolean vert;
        if(orient.equals("right")){
            vert=false;
        }
        else if(orient.equals("up")){
            vert=true;
        }
        else{
            System.out.println("Invalid input, defaulted to right");
            vert=false;
        }

        Ship car=new Carrier(xPos-1,yPos-1,vert);
        int count=0;
        for(Coordinate c:car.getCoordinates()){
            if(c.getX()>9||c.getY()>9||c.getY()<0){
                count++;
            }
        }
        while(count>0){
            System.out.println("Invalid input, Reenter coordinates: ");
            System.out.print("Location of Carrier: \nRow: ");
            yPos=scan.nextInt();
            System.out.print("\nCol: ");
            xPos=scan.nextInt();

            System.out.print("\nOrientation (right/up): ");
            orient=scan.next();

            if(orient.equals("right")){
                vert=false;
            }
            else if(orient.equals("up")){
                vert=true;
            }
            else{
                System.out.println("Invalid input, defaulted to right");
                vert=false;
            }
            count=0;
            car=new Carrier(xPos-1,yPos-1,vert);
            for(Coordinate c:car.getCoordinates()){
                if(c.getX()>9||c.getY()>9||c.getY()<0){
                    count++;
                }
            }
        }
        return car;

    }

    /**
     * This method creates a battleship ship in the game class.
     * It makes sure the inputs are valid, and checks the orientation
     * entered so that it creates a ship of the appropriate 
     * length and the appropriate orientation.
     * @param: none
     * @return: Ship, which is the ship being created.
     * @Author: Andrew Zhuang
     */
    public Ship createBattle()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("\nLocation of Battleship: \nRow: ");
        int yPos=scan.nextInt();
        System.out.print("\nCol: ");
        int xPos=scan.nextInt();

        System.out.print("\nOrientation (right/up): ");
        String orient=scan.next();
        boolean vert;
        if(orient.equals("right")){
            vert=false;
        }
        else if(orient.equals("up")){
            vert=true;
        }
        else{
            System.out.println("Invalid input, defaulted to right");
            vert=false;
        }

        Ship battle=new Battleship(xPos-1,yPos-1,vert);
        int count=0;
        for(Coordinate c:battle.getCoordinates()){
            if(c.getX()>9||c.getY()>9||c.getY()<0){
                count++;
            }
        }
        while(count>0){
            System.out.println("Invalid input, Reenter coordinates: ");
            System.out.print("Location of Battleship: \nRow: ");
            yPos=scan.nextInt();
            System.out.print("\nCol: ");
            xPos=scan.nextInt();

            System.out.print("\nOrientation (right/up): ");
            orient=scan.next();

            if(orient.equals("right")){
                vert=false;
            }
            else if(orient.equals("up")){
                vert=true;
            }
            else{
                System.out.println("Invalid input, defaulted to right");
                vert=false;
            }
            count=0;
            battle=new Battleship(xPos-1,yPos-1,vert);
            for(Coordinate c:battle.getCoordinates()){
                if(c.getX()>9||c.getY()>9||c.getY()<0){
                    count++;
                }
            }
        }
        return battle;

    }
}
