import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOGrijper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOGrijper extends Actor
{
    /**
     * Act - do whatever the VOGrijper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private VOConB container;
    
    public void act() 
    {
        int X = getX();  
        int Y = getY();
        int Speed = 3; 
  
        if(Greenfoot.isKeyDown("a")){
            setLocation(X -Speed, Y);
        } 
        if(Greenfoot.isKeyDown("d")){
            setLocation(X +Speed, Y);
        }
        if(Greenfoot.isKeyDown("w")){
            if(getY() <= 390){} else {
                setLocation(X, Y -Speed);
            }
        }
        if(Greenfoot.isKeyDown("s")){
            if(getY() >= 690){}  else {
                setLocation(X, Y +Speed);
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(X -Speed, Y);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(X +Speed, Y);
        }
        if(Greenfoot.isKeyDown("up")){
            if(getY() <= 390){} else {
                setLocation(X, Y -Speed);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            if(getY() >= 690){}  else {
                setLocation(X, Y +Speed);
            }
        }

    }
}
