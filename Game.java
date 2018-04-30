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
    private ArrayList<Integer> xList;
    private ArrayList<Integer> yList;
    private Player p;
    private Board playerBoard;
    private Opponent o; 
    public Game()
    {
        xList=new ArrayList<Integer>();
        yList=new ArrayList<Integer>();
        playerBoard=new Board();
        boolean overlap=true;
        while(overlap){
            int x=0;
            Ship sub=createSub();
            Ship gun=createGun();
            //checks overlap
            for(Coordinate c1:sub.getCoordinates()){
                for(Coordinate c2:gun.getCoordinates()){
                    if(c1.getX()==c2.getX()&&c1.getY()==c2.getY()){
                        System.out.println("Sub and Gunboat overlap, please reenter coordinates");
                        x++;
                    }
                }
            }
            overlap=(x>0);
        }
        overlap=true;
        
        while(overlap){
            int x=0;
            Ship car=createCar();
            //checks overlap
            for(Coordinate c1:sub.getCoordinates()){
                for(Coordinate c2:car.getCoordinates()){
                    if(c1.getX()==c2.getX()&&c1.getY()==c2.getY()){
                        System.out.println("Sub and Carrier overlap, please reenter coordinates");
                        x++;
                    }
                }
            }
            overlap=(x>0);
        }
        overlap=true;
        while(overlap){
            int x=0;
            Ship battle=createBattle();
            //checks overlap
            for(Coordinate c1:sub.getCoordinates()){
                for(Coordinate c2:battle.getCoordinates()){
                    if(c1.getX()==c2.getX()&&c1.getY()==c2.getY()){
                        System.out.println("Sub and Battleship overlap, please reenter coordinates ");
                        x++;
                    }
                }
            }
            overlap=(x>0);
        }

    }

    public void updatexList(int x){
        xList.add(x);
    }

    public void updateyList(int y){
        yList.add(y);
    }

    public Ship createSub()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Location of Submarine: \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();

        for(int i=0; i<xList.size()-1;i++){
            if(xPos==xList.get(i)&&yPos==yList.get(i)){
                System.out.println("Cannot put ships on top of each other");
                System.out.println("Location of Submarine: \nRow: ");
                yPos=scan.nextInt();
                System.out.println("Col: ");
                xPos=scan.nextInt();
            }
        }
        updatexList(xPos);
        updateyList(yPos);

        System.out.println("Orientation (right/up): ");
        String orient=scan.nextLine();
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
        System.out.println("Location of Gunboat: \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();

        for(int i=0; i<xList.size()-1;i++){
            if(xPos==xList.get(i)&&yPos==yList.get(i)){
                System.out.println("Cannot put ships on top of each other");
                System.out.println("Location of Gunboat: \nRow: ");
                yPos=scan.nextInt();
                System.out.println("Col: ");
                xPos=scan.nextInt();
            }
        }
        updatexList(xPos);
        updateyList(yPos);

        System.out.println("Orientation (right/up): ");
        String orient=scan.nextLine();
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
        System.out.println("Location of Carrier: \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();

        for(int i=0; i<xList.size()-1;i++){
            if(xPos==xList.get(i)&&yPos==yList.get(i)){
                System.out.println("Cannot put ships on top of each other");
                System.out.println("Location of Carrier: \nRow: ");
                yPos=scan.nextInt();
                System.out.println("Col: ");
                xPos=scan.nextInt();
            }
        }
        updatexList(xPos);
        updateyList(yPos);

        System.out.println("Orientation (right/up): ");
        String orient=scan.nextLine();
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
        System.out.println("Location of Battleship: \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();

        for(int i=0; i<xList.size()-1;i++){
            if(xPos==xList.get(i)&&yPos==yList.get(i)){
                System.out.println("Cannot put ships on top of each other");
                System.out.println("Location of Battleship: \nRow: ");
                yPos=scan.nextInt();
                System.out.println("Col: ");
                xPos=scan.nextInt();
            }
        }
        updatexList(xPos);
        updateyList(yPos);

        System.out.println("Orientation (right/up): ");
        String orient=scan.nextLine();
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
