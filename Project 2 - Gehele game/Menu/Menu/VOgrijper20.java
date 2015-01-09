import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOgrijper20 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOgrijper20 extends VOCrane2
{
    private int xSpeed = 2;
    private int vSpeed = 2;
    
    /**
     * Act - do whatever the VOgrijper20 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        setLocation(getX() +xSpeed, getY() +vSpeed);
        
       if (getX() == 298){
          xSpeed = -xSpeed;
        } 
        
        if(getX() == 1000)
        {
         xSpeed = -xSpeed; 
        }
        
        if (getY() <= 10){
            vSpeed = -vSpeed;
        }
        
        if (getY() >= 303){
            vSpeed = -vSpeed;
        }
    }    
}
