import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CCBoei extends Actor
{
    /**
     * Act - do whatever the Boei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int movingCounter = 0;  
    private int actCounter = 0;
   
      
    public void act() {  
        final int X = getX();
        final int Y = getY();
        if (actCounter > 30) {
            if (movingCounter <= 2) {  
                setLocation(X + 1, Y);   //move right;  
            }  
            else if (movingCounter <= 4) {  
                setLocation(X - 1, Y);   //move left;  
            }  
            else {  
                movingCounter = 0;  
            }  
        movingCounter++;  
        actCounter = 0;
        }
            else {
            actCounter++;
            }
    }  
} 
