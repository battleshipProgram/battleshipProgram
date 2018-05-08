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
        if(overlapSubGun(sub,gun)){
            System.out.println("The Sub and the Gunship are overlapping, please reenter coordinates");
        }
        if(overlapSubCarrier(sub,car)){
            System.out.println("The Sub and the Carrier are overlapping, please reenter coordinates");
        }
        if(overlapSubBattle(sub,battle)){
            System.out.println("The Sub and the Battleship are overlapping, please reenter coordinates");
        }
        if(overlapGunCarrier(gun,car)){
            System.out.println("The Gunship and the Carrier are overlapping, please reenter coordinates");
        }
        if(overlapGunBattle(gun,battle)){
            System.out.println("The Gunship and the Battleship are overlapping, please reenter coordinates");
        }
        if(overlapCarrierBattle(car,battle)){
            System.out.println("The Carrier and the Battleship are overlapping, please reenter coordinates");
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
        else{
            vert=true;
        }
        if(orient.equals("right")){
            vert=false;
        }
        else{
            vert=true;
        }

        Ship sub=new Submarine(xPos,yPos,vert);
        return sub;

    }

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
        else{
            vert=true;
        }
        if(orient.equals("right")){
            vert=false;
        }
        else{
            vert=true;
        }

        Ship gun=new Gunboat(xPos,yPos,vert);
        return gun;

    }

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
        else{
            vert=true;
        }
        if(orient.equals("right")){
            vert=false;
        }
        else{
            vert=true;
        }

        Ship car=new Carrier(xPos,yPos,vert);
        return car;

    }

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
        else{
            vert=true;
        }
        if(orient.equals("right")){
            vert=false;
        }
        else{
            vert=true;
        }

        Ship battle=new Battleship(xPos,yPos,vert);
        return battle;

    }
}
