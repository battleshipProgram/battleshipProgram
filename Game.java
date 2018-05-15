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
    private Board targets;
    public Game()
    {
        playerBoard=new Board();
        targets=new Board();
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

        for(Coordinate c:sub.getCoordinates()){
            playerBoard.setShip(c.getY(),c.getX());
        }
        for(Coordinate c:gun.getCoordinates()){
            playerBoard.setShip(c.getY(),c.getX());
        }
        for(Coordinate c:car.getCoordinates()){
            playerBoard.setShip(c.getY(),c.getX());
        }
        for(Coordinate c:battle.getCoordinates()){
            playerBoard.setShip(c.getY(),c.getX());
        }
        System.out.println("\nYour Board: ");
        playerBoard.printBoard();
        System.out.println("\nLocation to shoot:\nRow: ");
        Scanner scan=new Scanner(System.in);
        int yShot=scan.nextInt();
        System.out.println("\nColumn: ");
        int xShot=scan.nextInt();
        while(Math.abs(xShot-5)>5||Math.abs(yShot-5)>5){
            System.out.println("Invalid location, reenter coordinates");
            System.out.println("\nLocation to shoot:\nRow: ");
            scan=new Scanner(System.in);
            yShot=scan.nextInt();
            System.out.println("\nColumn: ");
            xShot=scan.nextInt();
        }
        ArrayList<Coordinate> allcoords=new ArrayList<Coordinate>();
        for(Coordinate c:sub.getCoordinates()){
            allcoords.add(c);
        }
        for(Coordinate c:gun.getCoordinates()){
            allcoords.add(c);
        }
        for(Coordinate c:car.getCoordinates()){
            allcoords.add(c);
        }
        for(Coordinate c:battle.getCoordinates()){
            allcoords.add(c);
        }
        Coordinate shot=new Coordinate(xShot,yShot);
        int hitCount=0;
        for(Coordinate c:allcoords){
            if(shot.equals(c)){
                targets.playerHit(shot.getY(),shot.getX());
                System.out.println("Nice shot!");
                hitCount++;
            }
        }
        if(hitCount==0){
            System.out.println("Miss!");
            targets.playerMiss(shot.getY(),shot.getX());
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
