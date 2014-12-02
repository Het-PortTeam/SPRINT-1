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
        
        if (actCounter > 15) {
        
        
            if (movingCounter < 10) {  
                setLocation(getX() + 1, getY());//move right;  
            }  
            else if (movingCounter < 20) {  
                setLocation(getX() - 1, getY());//move left;  
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
