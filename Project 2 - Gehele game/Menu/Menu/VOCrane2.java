import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOCrane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOCrane2 extends Actor
{
    private int xSpeed = 2;
    
    /**
     * Act - do whatever the VOCrane2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX() +xSpeed, getY());
        
       if (getX() == 298){
          xSpeed = -xSpeed;
        } 
        
        if(getX() == 1000)
        {
         xSpeed = -xSpeed; 
        }
    }
    
}


