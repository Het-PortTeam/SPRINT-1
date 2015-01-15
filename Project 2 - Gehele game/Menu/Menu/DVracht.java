import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class DVracht here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVracht extends Actor
{
    /**
     * Act - do whatever the DVracht wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean Illegal;
    int PointValue;
    
    public DVracht(boolean Illegal, int PointValue)
    {
         setIllegal(Illegal);
         setImage();
    }
    
    public void setImage()
    {
        int randFour = randInt(1, 4);
        int randThree = randInt(1, 3);
        if(getIllegal() == true)
        {            
            if(randFour == 1){
                setImage(new GreenfootImage("Vracht1.png"));
            }
            if(randFour == 2){
                setImage(new GreenfootImage("Vracht3.png"));
            }
            if(randFour == 3){
                setImage(new GreenfootImage("Vracht6.png"));
            }
            if(randFour == 4){
                setImage(new GreenfootImage("Vracht7.png"));
            }
        }
        else
        {
            if(randThree == 1){
                setImage(new GreenfootImage("Vracht4.png"));
            }
            if(randThree == 2){
                setImage(new GreenfootImage("Vracht2.png"));
            }
            if(randThree == 3){
                setImage(new GreenfootImage("Vracht5.png"));
            }
        }
    }
    
    public static int randInt(int min, int max) {
        Random rand = new Random();
    
        int randomNum = rand.nextInt((max - min) + 1) + min;
    
        return randomNum;
    }
    
    public boolean getIllegal()
    {
        return Illegal;
    }
    
    public boolean setIllegal(boolean theLaw)
    {
        Illegal = theLaw;
        return Illegal;
    }
    
    public int getPointValue()
    {
        return PointValue;
    }
}
