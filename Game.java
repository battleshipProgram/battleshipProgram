import java.util.Scanner;
import java.util.ArrayList; 
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

        p=new Player(createSub(),createGun(),createCarrier(),createBattle(),playerBoard);

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

    public Gunboat createGun()
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

        Gunboat gun=new Gunboat(xPos,yPos,vert);
        return gun;

    }

    public Carrier createCarrier()
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

        Carrier car=new Carrier(xPos,yPos,vert);
        return car;

    }

    public Battleship createBattle()
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

        Battleship battle=new Battleship(xPos,yPos,vert);
        return battle;

    }
}
