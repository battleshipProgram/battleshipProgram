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
    public Game()
    {
        xList=new ArrayList<Integer>();
        yList=new ArrayList<Integer>();
        
        
    }
    public void updatexList(int x){
        xList.add(x);
    }
    public void updateyList(int y){
        yList.add(y);
    }
    public Ship createShip(String s)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Location of "+s+": \nRow: ");
        int yPos=scan.nextInt();
        System.out.println("Col: ");
        int xPos=scan.nextInt();
        
        for(int i=0; i<xList.size()-1;i++){
            if(xPos==xList.get(i)&&yPos==yList.get(i)){
                System.out.println("Cannot put ships on top of each other");
                System.out.println("Location of "+s+": \nRow: ");
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
        if(s.equals("Gunboat")){
            Gunboat gun=new Gunboat(xPos,yPos,vert);
            return gun;
        }
        else if(s.equals("Submarine")){
            Submarine sub=new Submarine(xPos,yPos,vert);
            return sub;
        }
        else if(s.equals("Carrier")){
            Carrier car=new Carrier(xPos,yPos,vert);
            return car;
        }
        else{
            Battleship battle=new Battleship(xPos,yPos,vert);
            return battle;
        }
    }

}
